/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.example.chronicle.model;

import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class FreeBusyRequest {

    // TODO: use date instead of String
    private String timeMin;
    private String timeMax;
    private String timeZone;
    private int groupExpansionMax;
    private int calendarExpansionMax;
    private List<Identified> items = new LinkedList<Identified>();

    public String getTimeMin() {
        return timeMin;
    }
    public void setTimeMin(String timeMin) {
        this.timeMin = timeMin;
    }

    public String getTimeMax() {
        return timeMax;
    }
    public void setTimeMax(String timeMax) {
        this.timeMax = timeMax;
    }

    public String getTimeZone() {
        return timeZone;
    }
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public int getGroupExpansionMax() {
        return groupExpansionMax;
    }
    public void setGroupExpansionMax(int groupExpansionMax) {
        this.groupExpansionMax = groupExpansionMax;
    }

    public int getCalendarExpansionMax() {
        return calendarExpansionMax;
    }
    public void setCalendarExpansionMax(int calendarExpansionMax) {
        this.calendarExpansionMax = calendarExpansionMax;
    }

    public List<Identified> getItems() {
        return items;
    }
    public void setItems(List<Identified> items) {
        this.items = items;
    }
}
