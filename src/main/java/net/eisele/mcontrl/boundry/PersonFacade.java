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

import java.util.List;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import net.eisele.mcontrl.control.PersonService;
import net.eisele.mcontrl.entities.Person;

/**
 *
 * @author eiselem
 */
@Stateless
@Path("person")
public class PersonFacade {

    private static final Logger logger = Logger.getLogger(PersonFacade.class.getName());
    @EJB
    PersonService personService;

    @POST
    @Consumes("application/json")
    public void create(Person entity) {
        personService.create(entity);
    }

    @PUT
    @Consumes("application/json")
    public void edit(Person entity) {
        personService.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        personService.remove(personService.find(id));
    }

    @GET
    @Path("{id}")
    @Produces("application/json")
    public Person find(@PathParam("id") Long id) {
        return personService.find(id);
    }

    @GET
    @Produces("application/json")
    public List<Person> getAll() {
        return personService.getAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces("application/json")
    public List<Person> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return personService.findRange(new int[]{from, to});
    }
}
