/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eisele.mcontrl.control;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import net.eisele.mcontrl.entities.OrgUnit;
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
public class OrganisationServiceTest {

    public OrganisationServiceTest() {
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
     * Test of getAll method, of class OrganisationService.
     */
    @Test
    public void testGetAll() throws Exception {
        System.out.println("getAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        OrganisationService instance = (OrganisationService) container.getContext().lookup("java:global/classes/OrganisationService");

        List result = instance.getAll();
        assertEquals(1, result.size());
        container.close();


    }
}