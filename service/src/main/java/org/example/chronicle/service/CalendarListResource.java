/**
 * Copyright (C) 2010 Talend Inc. - www.talend.com
 */
package org.example.chronicle.service;

import org.example.chronicle.api.CalendarList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * JAX-RS MembershipService root resource
 */
public class CalendarListResource implements CalendarList {
    private static final Logger LOG = LoggerFactory.getLogger(CalendarListResource.class);

    public CalendarListResource() {
    }

    public void delete(String calendarId) {
        // TODO Auto-generated method stub
        LOG.info("CalendarList.delete: {}", calendarId);
    }

    public void get(String calendarId) {
        // TODO Auto-generated method stub
        LOG.info("CalendarList.get: {}", calendarId);
    }

    public void insert() {
        // TODO Auto-generated method stub
        LOG.info("CalendarList.insert");
    }

    public void list() {
        // TODO Auto-generated method stub
        LOG.info("CalendarList.list");
    }

    public void update(String calendarId) {
        // TODO Auto-generated method stub
        LOG.info("CalendarList.update: {}", calendarId);
    }

}
