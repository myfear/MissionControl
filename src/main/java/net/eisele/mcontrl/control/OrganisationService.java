/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eisele.mcontrl.control;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.eisele.mcontrl.entities.OrgUnit;

/**
 *
 * @author eiselem
 */
@Named
@Stateless
public class OrganisationService extends AbstractService<OrgUnit> {

    @PersistenceContext
    protected EntityManager em;

    public OrganisationService() {
        super(OrgUnit.class);
    }

    @Override
    public void create(OrgUnit entity) {
        super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OrgUnit> getAll() {
        return super.getAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
