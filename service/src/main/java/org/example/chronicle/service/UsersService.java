/**
 * Copyright (C) 2010 Talend Inc. - www.talend.com
 */
package org.example.chronicle.service;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.example.chronicle.api.CalendarList;
import org.example.chronicle.api.Settings;
import org.example.chronicle.api.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * JAX-RS UsersService root resource
 */
public class UsersService implements Users {
    private static final Logger LOG = LoggerFactory.getLogger(UsersService.class);

    private CalendarList meCalendarList = new CalendarListResource();
    private Settings meSettings = new SettingsResource();
 
    public UsersService() {
    }

    public CalendarList getCalendarList(String userId) {
        LOG.info("Getting CalendarList for user: {}", userId);
        return meCalendarList;
    }

    public Settings getSettings(String userId) {
        LOG.info("Getting Settings for user: {}", userId);
        return meSettings;
    }

    /*
    @Override
    public Calendar getCalendar(int id) {
        System.out.println("getCalendar called - id = " + id);
        Calendar c = calendars.get(id);
        if (c == null) {
            // will return HTTP 404 "not found" code
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        System.out.println("Calendar ID/Summary = " + c.getId() + " / " + c.getSummary());
        return c;
    }
*/
}
