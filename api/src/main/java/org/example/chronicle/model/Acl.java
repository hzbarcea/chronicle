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

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.EntityTag;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Acl {

    private String kind = Constants.KIND_ACL;
    private EntityTag etag;
    private String nextPageToken;
    private List<AclRule> items = new ArrayList<AclRule>();

    public String getKind() {
        return kind;
    }

    public String getEtag() {
        return etag.getValue();
    }
    public void setEtag(String etag) {
        this.etag = new EntityTag(etag);
    }

    public String getNextPageToken() {
        return nextPageToken;
    }
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public List<AclRule> getItems() {
        return items;
    }

}
