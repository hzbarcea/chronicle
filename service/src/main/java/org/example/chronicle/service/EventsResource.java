/**
 * Copyright (C) 2010 Talend Inc. - www.talend.com
 */
package org.example.chronicle.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
public class EventsResource implements Events {
    private static final Logger LOG = LoggerFactory.getLogger(EventsResource.class);

    public void delete(String eventId) {
        LOG.info("Events.delete: {}", eventId);
        // TODO Auto-generated method stub
        
    }

    public Object get(String eventId) {
        // TODO Auto-generated method stub
        LOG.info("Events.get: {}", eventId);
        return null;
    }

    public Object importEvent() {
        // TODO Auto-generated method stub
        LOG.info("Events.importEvent");
        return null;
    }

    public Object insert() {
        // TODO Auto-generated method stub
        LOG.info("Events.insert");
        return null;
    }

}
