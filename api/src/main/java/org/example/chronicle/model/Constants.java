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


public final class Constants {

    public static final String KIND_PREFIX = "calendar#";
    public static final String KIND_ACL = KIND_PREFIX + "acl";
    public static final String KIND_ACLRULE = KIND_PREFIX + "aclRule";
    public static final String KIND_FREEBUSY = KIND_PREFIX + "freeBusy";

    public static final String SCOPE_TYPE_DEFAULT = "default";
    public static final String SCOPE_TYPE_USER = "user";
    public static final String SCOPE_TYPE_GROUP = "group";
    public static final String SCOPE_TYPE_DOMAIN = "domain";

    public static final String ROLE_NONE = "none";
    public static final String ROLE_FREEBUSY_READER = "freeBusyReader";
    public static final String ROLE_READER = "reader";
    public static final String ROLE_WRITER = "writer";
    public static final String ROLE_OWNER = "owner";

}

