/**
 * Copyright (C) 2010 Talend Inc. - www.talend.com
 */
package org.example.chronicle.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.example.chronicle.api.Calendars;
import org.example.chronicle.model.Calendar;

/**
 * JAX-RS MembershipService root resource
 */
public class CalendarsService implements Calendars {
    private AtomicLong currentId = new AtomicLong();
    private Map<String, Calendar> calendars = new ConcurrentHashMap<String, Calendar>();

    public CalendarsService() {
        // seed HashMap with first calendar
        String id = Long.toHexString(currentId.incrementAndGet());
        Calendar c = new Calendar();
        c.setId(id);
        c.setEtag(id);
        c.setSummary("First Calendar");
        c.setDescription("First Calendar");
        calendars.put(c.getId(), c);
        System.out.println("Added: " + c.getId() + " / " + c.getSummary());

        id = Long.toHexString(currentId.incrementAndGet());
        c = new Calendar();
        c.setId(id);
        c.setEtag(id);
        c.setSummary("Second Calendar");
        c.setDescription("Second Calendar");
        calendars.put(c.getId(), c);
        System.out.println("Added: " + c.getId() + " / " + c.getSummary());

        id = Long.toHexString(currentId.incrementAndGet());
        c = new Calendar();
        c.setId(id);
        c.setEtag(id);
        c.setSummary("Third Calendar");
        c.setDescription("Third Calendar");
        calendars.put(c.getId(), c);
        System.out.println("Added: " + c.getId() + " / " + c.getSummary());

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
    public void clear(String calendarId) {
        // TODO Auto-generated method stub
        
    }

    public void delete(String calendarId) {
        // TODO Auto-generated method stub
        
    }

    public Calendar get(String calendarId) {
        // TODO Auto-generated method stub
        return null;
    }

    public void insert(String calendarId) {
        // TODO Auto-generated method stub
        
    }

    public void update(String calendarId) {
        // TODO Auto-generated method stub
        
    }
}
