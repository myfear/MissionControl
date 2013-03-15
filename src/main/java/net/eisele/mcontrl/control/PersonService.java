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
import net.eisele.mcontrl.entities.Person;

/**
 *
 * @author eiselem
 */
@Named
@Stateless
public class PersonService extends AbstractService<Person> {

    @PersistenceContext
    protected EntityManager em;

    public PersonService() {
        super(Person.class);
    }

    @Override
    public void create(Person entity) {
        super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Person entity) {
        super.edit(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Person entity) {
        super.remove(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Person> getAll() {
        return super.getAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
