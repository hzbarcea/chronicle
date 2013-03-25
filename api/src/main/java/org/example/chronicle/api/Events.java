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
package org.example.chronicle.api;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.xml.bind.annotation.XmlRootElement;

import org.example.chronicle.model.Calendar;

/*
 * See https://developers.google.com/google-apps/calendar/v3/reference/
 */
@XmlRootElement(name = "events")
public interface Events {

    /*
     * Deletes an access control rule.
     */
    @DELETE
    @Path("/{eventId}")
    void delete(@PathParam("eventId") String eventId);

    /*
     * Returns an access control rule.
     */
    @GET
    @Path("/{eventId}")
    Object get(@PathParam("eventId") String eventId);

    /*
     * Creates an access control rule.
     */
    @POST
    @Path("/import")
    Object importEvent();

    /*
     * Creates an access control rule.
     */
    @POST
    Object insert();

    // TODO: implement other methods
    // TODO: implement @Patch
}

