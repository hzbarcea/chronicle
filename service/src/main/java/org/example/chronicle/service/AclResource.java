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
import org.example.chronicle.model.Calendar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * JAX-RS MembershipService root resource
 */
public class AclResource implements Acl {
    private static final Logger LOG = LoggerFactory.getLogger(AclResource.class);

    public void delete(String ruleId) {
        LOG.info("Acl.delete: {}", ruleId);
        // TODO Auto-generated method stub
        
    }

    public Object get(String ruleId) {
        LOG.info("Acl.get: {}", ruleId);
        // TODO Auto-generated method stub
        return null;
    }

    public Object insert() {
        LOG.info("Acl.insert");
        // TODO Auto-generated method stub
        return null;
    }

    public Calendar list() {
        LOG.info("Acl.list");
        // TODO Auto-generated method stub
        return null;
    }

    public Object update(String ruleId) {
        LOG.info("Acl.update: {}", ruleId);
        // TODO Auto-generated method stub
        return null;
    }

}
