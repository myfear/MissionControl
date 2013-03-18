/**
 * Copyright [2013] Markus Eisele
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package net.eisele.mcontrl.boundry;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import net.eisele.mcontrl.control.MissionService;
import net.eisele.mcontrl.control.PersonService;
import net.eisele.mcontrl.entities.Mission;

/**
 *
 * @author eiselem
 */
@Stateless
@Path("mission")
public class MissionFacade {

    @EJB
    PersonService personService;
    @EJB
    MissionService missionService;

    @POST
    @Consumes("application/json")
    public void create(Mission entity) {
        missionService.create(entity);
    }

    @PUT
    @Consumes("application/json")
    public void edit(Mission entity) {
        missionService.edit(entity);
    }
}
