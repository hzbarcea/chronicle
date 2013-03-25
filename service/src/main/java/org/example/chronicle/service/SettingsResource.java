/**
 * Copyright (C) 2010 Talend Inc. - www.talend.com
 */
package org.example.chronicle.service;

import org.example.chronicle.api.Settings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * JAX-RS MembershipService root resource
 */
public class SettingsResource implements Settings {
    private static final Logger LOG = LoggerFactory.getLogger(SettingsResource.class);

    public SettingsResource() {
    }

    public Object get(String setting) {
        // TODO Auto-generated method stub
        LOG.info("Settings.get: {}", setting);
        return null;
    }

    public Object list() {
        // TODO Auto-generated method stub
        LOG.info("Settings.list");
        return null;
    }

}
