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
package net.eisele.mcontrl.control;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.eisele.mcontrl.entities.Mission;

/**
 *
 * @author eiselem
 */
@Stateless
public class MissionService extends AbstractService<Mission> {

    @PersistenceContext
    protected EntityManager em;

    public MissionService() {
        super(Mission.class);
    }

    public MissionService(Class<Mission> entityClass) {
        super(entityClass);
    }

    @Override
    public int count() {
        return super.count();
    }

    @Override
    public void create(Mission entity) {
        super.create(entity);
    }

    @Override
    public void edit(Mission entity) {
        super.edit(entity);
    }

    @Override
    public void remove(Mission entity) {
        super.remove(entity);
    }

    @Override
    public Mission find(Object id) {
        return super.find(id);
    }

    @Override
    public List<Mission> getAll() {
        return super.getAll();
    }

    @Override
    public List<Mission> findRange(int[] range) {
        return super.findRange(range);
    }

    public String hello() {
        return "Hello";
    }

    @Override
    protected EntityManager getEntityManager() {
        return this.em;
    }
}
