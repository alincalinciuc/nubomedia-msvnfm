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

package org.openbaton.autoscaling.api;

import org.openbaton.autoscaling.core.decision.DecisionManagement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class RestDecisionInterface {

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @Autowired private DecisionManagement decisionManagement;

  //    /**
  //     * Activates autoscaling for the passed NSR
  //     *
  //     * @param msg : NSR in payload to add for autoscaling
  //     */
  //    @RequestMapping(value = "INSTANTIATE_FINISH", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  //    @ResponseStatus(HttpStatus.CREATED)
  //    public void activate(@RequestBody String msg) throws NotFoundException {
  //        log.debug("========================");
  //        log.debug("msg=" + msg);
  //        JsonParser jsonParser = new JsonParser();
  //        JsonObject json = jsonParser.parse(msg).getAsJsonObject();
  //        Gson mapper = new GsonBuilder().create();
  //        Action action = mapper.fromJson(json.get("action"), Action.class);
  //        log.debug("ACTION=" + action);
  //        NetworkServiceRecord nsr = mapper.fromJson(json.get("payload"), NetworkServiceRecord.class);
  //        log.debug("NSR=" + nsr);
  //        decisionManagement.activate(nsr.getId());
  //    }
  //
  //    /**
  //     * Deactivates autoscaling for the passed NSR
  //     *
  //     * @param msg : NSR in payload to add for autoscaling
  //     */
  //    @RequestMapping(value = "RELEASE_RESOURCES_FINISH", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  //    @ResponseStatus(HttpStatus.CREATED)
  //    public void deactivate(@RequestBody String msg) throws NotFoundException {
  //        log.debug("========================");
  //        log.debug("msg=" + msg);
  //        JsonParser jsonParser = new JsonParser();
  //        JsonObject json = jsonParser.parse(msg).getAsJsonObject();
  //        Gson mapper = new GsonBuilder().create();
  //        Action action = mapper.fromJson(json.get("action"), Action.class);
  //        log.debug("ACTION=" + action);
  //        NetworkServiceRecord nsr = mapper.fromJson(json.get("payload"), NetworkServiceRecord.class);
  //        log.debug("NSR=" + nsr);
  //        decisionManagement.deactivate(nsr);
  //    }
  //
  //    /**
  //     * Stops autoscaling for the passed NSR
  //     *
  //     * @param msg : NSR in payload to add for autoscaling
  //     */
  //    @RequestMapping(value = "ERROR", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  //    @ResponseStatus(HttpStatus.CREATED)
  //    public void stop(@RequestBody String msg) throws NotFoundException {
  //        log.debug("========================");
  //        log.debug("msg=" + msg);
  //        JsonParser jsonParser = new JsonParser();
  //        JsonObject json = jsonParser.parse(msg).getAsJsonObject();
  //        Gson mapper = new GsonBuilder().create();
  //        Action action = mapper.fromJson(json.get("action"), Action.class);
  //        log.debug("ACTION=" + action);
  ////        try {
  ////            NetworkServiceRecord nsr = mapper.fromJson(json.get("payload"), NetworkServiceRecord.class);
  ////            log.debug("NSR=" + nsr);
  ////            elasticityManagement.deactivate(nsr);
  ////        } catch (NullPointerException e) {
  ////            VirtualNetworkFunctionRecord vnfr = mapper.fromJson(json.get("payload"), VirtualNetworkFunctionRecord.class);
  ////            log.debug("vnfr=" + vnfr);
  ////            elasticityManagement.deactivate(vnfr);
  ////        }
  //    }

}
