/**
 * Copyright (C) 2010 Talend Inc. - www.talend.com
 */
package org.example.chronicle.service;

import org.example.chronicle.api.Colors;
import org.example.chronicle.model.Calendar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * JAX-RS CalendarsService root resource
 */
public class ColorsService implements Colors {
    private static final Logger LOG = LoggerFactory.getLogger(ColorsService.class);

    public ColorsService() {
    }

    public Calendar get() {
        LOG.info("Getting color definitions");
        return null;
    }

}
