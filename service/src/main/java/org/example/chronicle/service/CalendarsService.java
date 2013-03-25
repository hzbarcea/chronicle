/**
 * Copyright (C) 2010 Talend Inc. - www.talend.com
 */
package org.example.chronicle.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.example.chronicle.api.Acl;
import org.example.chronicle.api.Calendars;
import org.example.chronicle.api.Events;
import org.example.chronicle.model.Calendar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * JAX-RS MembershipService root resource
 */
public class CalendarsService implements Calendars {
    private static final Logger LOG = LoggerFactory.getLogger(CalendarsService.class);

    private AtomicLong currentId = new AtomicLong();
    private Map<String, Calendar> calendars = new ConcurrentHashMap<String, Calendar>();
    private Acl acl = new AclResource();
    private Events events = new EventsResource();

    public CalendarsService() {
        // seed HashMap with first calendar
        String id = Long.toHexString(currentId.incrementAndGet());
        Calendar c = new Calendar();
        c.setId(id);
        c.setEtag(id);
        c.setSummary("First Calendar");
        c.setDescription("First Calendar");
        calendars.put(c.getId(), c);
        LOG.info("Added: {} / {}", c.getId(), c.getSummary());

        id = Long.toHexString(currentId.incrementAndGet());
        c = new Calendar();
        c.setId(id);
        c.setEtag(id);
        c.setSummary("Second Calendar");
        c.setDescription("Second Calendar");
        calendars.put(c.getId(), c);
        LOG.info("Added: {} / {}", c.getId(), c.getSummary());

        id = Long.toHexString(currentId.incrementAndGet());
        c = new Calendar();
        c.setId(id);
        c.setEtag(id);
        c.setSummary("Third Calendar");
        c.setDescription("Third Calendar");
        calendars.put(c.getId(), c);
        LOG.info("Added: {} / {}", c.getId(), c.getSummary());

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
        LOG.info("Getting calendar: {}", calendarId);
        return calendars.get(calendarId);
    }

    public void insert(String calendarId) {
        // TODO Auto-generated method stub
        
    }

    public void update(String calendarId) {
        // TODO Auto-generated method stub
        
    }

    public Acl getAcl(String calendarId) {
        LOG.info("Getting Acl for calendar: {}", calendarId);
        return acl;
    }

    public Events getEvents(String calendarId) {
        LOG.info("Getting Events for calendar: {}", calendarId);
        return events;
    }
}
