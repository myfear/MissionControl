/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eisele.mcontrl.control;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import net.eisele.mcontrl.entities.OrgUnit;
import net.eisele.mcontrl.entities.Person;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eiselem
 */
public class PersonServiceTest {
    
    public PersonServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class PersonService.
     */
    @Test
    public void testCreate() throws Exception {
        OrgUnit unit = new OrgUnit();
        unit.setName("XT");
        unit.setLocation("Munich");
        
        
        System.out.println("create");
        Person entity = new Person();
        entity.setName("Markus");
        entity.setLocation("München");
        entity.setEmail("markus@eisele.net");
        entity.setPassword("test");
        entity.setOrgUnit(unit);
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PersonService instance = (PersonService) container.getContext().lookup("java:global/classes/PersonService");
        instance.create(entity);
        Thread.sleep(15000);
        container.close();
        
        
    }
    /**
     * Test of edit method, of class PersonService.
     */
}