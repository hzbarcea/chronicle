/**
 * Copyright (C) 2010 Talend Inc. - www.talend.com
 */
package org.example.chronicle.model;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * TODO: javadoc
 */
@XmlRootElement(name = "calendar")
public class Calendar {
    private String kind;
    private String etag;
    private String id;
    private String summary;
    private String description;
    private String location;
    private String timeZone;

    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }
    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Path("summary")
    public String getSummary() {
        return summary;
    }
    @PUT
    @Consumes("text/plain")
    @Path("name")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Path("description")
    public String getDescription() {
        return description;
    }
    @PUT
    @Consumes("text/plain")
    // @Path("name")
    public void setDescription(String description) {
        this.description = description;
    }

    @Path("location")
    public String getLocation() {
        return location;
    }
    @PUT
    @Consumes("text/plain")
    // @Path("name")
    public void setLocation(String location) {
        this.location = location;
    }

    @Path("timeZone")
    public String getTimeZone() {
        return timeZone;
    }
    @PUT
    @Consumes("text/plain")
    // @Path("name")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

}
