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

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.example.chronicle.model.Calendar;

/*
 * See https://developers.google.com/google-apps/calendar/v3/reference/
 */
@Produces({"application/json"})
@Consumes({"application/json"})
@Path("/")
public interface Calendars {

    /*
     * Clears a primary calendar. 
     * This operation deletes all data associated with the primary calendar of an account and cannot be undone.
     */
    @POST
    @Path("{calendarId}/clear")
    void clear(@PathParam("calendarId") String calendarId);

    /*
     * Deletes a secondary calendar. 
     */
    @DELETE
    @Path("{calendarId}")
    void delete(@PathParam("calendarId") String calendarId);

    /*
     * Returns metadata for a calendar. 
     */
    @GET
    @Path("{calendarId}")
    Calendar get(@PathParam("calendarId") String calendarId);
    
    /*
     * Creates a secondary calendar. 
     */
    @POST
    void insert(String calendarId);

    /*
     * Updates metadata for a calendar.
     */
    @PUT
    @Path("{calendarId}")
    void update(@PathParam("calendarId") String calendarId);

    /*
     * Updates metadata for a calendar. This method supports patch semantics.
     * 
     * Deal with the @PATCH verb later
    @PATCH
    @Path("/{calendarId}")
    void patch(@PathParam("calendarId") String calendarId);
    */

    @Path("{calendarId}/acl")
    Acl getAcl(@PathParam("calendarId") String calendarId);

    @Path("{calendarId}/events")
    Events getEvents(@PathParam("calendarId") String calendarId);

}
