/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.example.chronicle.server;

import javax.ws.rs.core.Application;
import javax.ws.rs.ext.RuntimeDelegate;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.transport.http_jetty.JettyHTTPDestination;
import org.apache.cxf.transport.http_jetty.JettyHTTPServerEngine;


public class ApplicationServer {

    private Server freebusyServer;
    
    public void start() throws Exception {
    	FreeBusyApplication freebusyApp = new FreeBusyApplication();
    	freebusyServer = startApplication(freebusyApp);
    }
    
    public void stop() throws Exception {
        freebusyServer.stop();
        freebusyServer.destroy();
    }
    
    private static Server startApplication(Application app) {
    	RuntimeDelegate delegate = RuntimeDelegate.getInstance();
        JAXRSServerFactoryBean bean = delegate.createEndpoint(app, JAXRSServerFactoryBean.class);

        // TODO: use a dynamic port maybe?
        bean.setAddress("http://localhost:8080" + bean.getAddress());
        bean.setStart(false);
        Server server = bean.create();
        JettyHTTPDestination dest = (JettyHTTPDestination)server.getDestination();
        JettyHTTPServerEngine engine = (JettyHTTPServerEngine)dest.getEngine();
        engine.setSessionSupport(true);
        
        server.start();
        return server;
    }
    
    public static void main(String args[]) throws Exception {
    	ApplicationServer server = new ApplicationServer();
    	server.start();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        server.stop();
        System.exit(0);
    }
}
