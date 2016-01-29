/*
 *
 *  * Copyright (c) 2015 Technische Universität Berlin
 *  *  Licensed under the Apache License, Version 2.0 (the "License");
 *  *  you may not use this file except in compliance with the License.
 *  *  You may obtain a copy of the License at
 *  *
 *  *         http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *  Unless required by applicable law or agreed to in writing, software
 *  *  distributed under the License is distributed on an "AS IS" BASIS,
 *  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  See the License for the specific language governing permissions and
 *  *  limitations under the License.
 *
 */

package org.openbaton.vnfm.repositories;


import org.openbaton.exceptions.NotFoundException;
import org.openbaton.vnfm.catalogue.MediaServer;

import java.util.Set;

/**
 * Created by lto on 06/05/15.
 */
public interface MediaServerRepositoryCustom {

    public Iterable findAllByVnrfId(String id);

    public void deleteByVnfrId(String vnfrId) throws NotFoundException;

    MediaServer findByHostName(String hostName);

    MediaServer findByHostName(String vnfrId, String hostName);

}
