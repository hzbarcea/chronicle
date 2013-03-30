/**
 * Copyright (C) 2010 Talend Inc. - www.talend.com
 */
package org.example.chronicle.model;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.EntityTag;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * TODO: javadoc
 */
@XmlRootElement(name = "calendar")
public class CalendarListEntry {

    private String kind = Constants.KIND_CALENDARLIST_ENTRY;
    private EntityTag etag;
    private String id;
    private String summary;
    private String description;
    private String location;
    private String timeZone;
    private String summaryOverride;
    private String colorId;
    private String backgroundColor;
    private String foregroundColor;
    private boolean hidden;
    private boolean selected;
    private String accessRole;
    private List<Reminder> defaultReminders = new ArrayList<Reminder>();

    public String getKind() {
        return kind;
    }

    public String getEtag() {
        return etag.getValue();
    }
    public void setEtag(String etag) {
        this.etag = new EntityTag(etag);
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

    public String getSummaryOverride() {
        return summaryOverride;
    }
    public void setSummaryOverride(String summaryOverride) {
        this.summaryOverride = summaryOverride;
    }

    public String getColorId() {
        return colorId;
    }
    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getForegroundColor() {
        return foregroundColor;
    }
    public void setForegroundColor(String foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public boolean isHidden() {
        return hidden;
    }
    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean isSelected() {
        return selected;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getAccessRole() {
        return accessRole;
    }
    public void setAccessRole(String accessRole) {
        this.accessRole = accessRole;
    }

    public List<Reminder> getDefaultReminders() {
        return defaultReminders;
    }

}
