/**
 * Copyright (C) 2010 Talend Inc. - www.talend.com
 */
package org.example.chronicle.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.example.chronicle.api.CalendarList;

/**
 * JAX-RS MembershipService root resource
 */
public class CalendarListService implements CalendarList {
    private AtomicLong currentId = new AtomicLong();
    private Map<Long, String> calendars = new ConcurrentHashMap<Long, String>();

    public CalendarListService() {
        calendars.put(currentId.incrementAndGet(), Long.toHexString(currentId.get()));
        calendars.put(currentId.incrementAndGet(), Long.toHexString(currentId.get()));
        calendars.put(currentId.incrementAndGet(), Long.toHexString(currentId.get()));
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
    public void delete(Long id) {
        // TODO Auto-generated method stub
    }
}
