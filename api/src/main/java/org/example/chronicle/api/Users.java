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

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/*
 * See https://developers.google.com/google-apps/calendar/v3/reference/
 */
@Path("/")
public interface Users {

    @Path("{userId}/calendarList")
    CalendarList getCalendarList(@PathParam("userId") String userId);

    @Path("{userId}/settings")
    Settings getSettings(@PathParam("userId") String userId);

}
