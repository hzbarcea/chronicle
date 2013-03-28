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
package org.example.chronicle.test.rest;

import java.io.IOException;
import java.util.Properties;

import org.apache.cxf.jaxrs.client.WebClient;

import org.example.chronicle.api.Acls;
import org.example.chronicle.model.Calendar;


public final class RESTClient implements Runnable {
    
    private static final String PORT_PROPERTY = "http.port";
    private static final int DEFAULT_PORT_VALUE = 8080;
    private static final int HTTP_PORT;

    static {
        // TODO: use a .local file as well and add a client.properties to the repo
        int port = DEFAULT_PORT_VALUE;
        Properties props = new Properties();
        try {
            props.load(RESTClient.class.getResourceAsStream("/client.properties"));
            port = Integer.valueOf(props.getProperty(PORT_PROPERTY));
        } catch (IOException ex) {
            System.out.println("Resource not available: 'client.properties'. Using defaults");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid non-numeric value for '" + PORT_PROPERTY + "'. Using defaults");
        }
        HTTP_PORT = port;
    }

    private String urlStem; 
    
    public RESTClient() {
        this(HTTP_PORT);
    }

    public RESTClient(int port) {
        urlStem = "http://localhost:" + port + "/services/calendars";
    }
    
    public void run() {
        try {
            Calendar c = getCalendar(1);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private Calendar getCalendar(int calendarNo) throws Exception {
        WebClient wc = WebClient.create(urlStem);
        wc.path(calendarNo);
        Calendar c = wc.get(Calendar.class);
        System.out.println("Calendar ID/Summary = " + c.getId() + " / " + c.getSummary());

        wc.path("acl/12345");
        Acls acl = wc.get(Acls.class);
        return c;
    }

    public static void main(String[] args) throws Exception {
        new RESTClient().run();
        System.out.println("\n");
        System.exit(0);
    }

}
