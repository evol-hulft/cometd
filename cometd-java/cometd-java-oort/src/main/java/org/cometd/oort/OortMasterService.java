/*
 * Copyright (c) 2008-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cometd.oort;

/**
 * @deprecated use {@link OortPrimaryService} instead.
 */
@Deprecated
public abstract class OortMasterService<R, C> extends OortPrimaryService<R, C> {
    @Deprecated
    public OortMasterService(Oort oort, String name, boolean primary) {
        super(oort, name, primary);
    }

    /**
     * @return whether this node is the "primary" node
     * @deprecated use {@link #isPrimary()} instead
     */
    @Deprecated
    public boolean isMaster() {
        return isPrimary();
    }

    /**
     * @return the "primary" Oort URL, or null if the "primary" node is down.
     * @deprecated use {@link #getPrimaryOortURL()} instead
     */
    @Deprecated
    public String getMasterOortURL() {
        return getPrimaryOortURL();
    }
}
