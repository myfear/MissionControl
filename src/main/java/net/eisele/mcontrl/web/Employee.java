/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eisele.mcontrl.web;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import net.eisele.mcontrl.entities.Person;

/**
 *
 * @author eiselem
 */
@Named
@FlowScoped("employee")
public class Employee {

    private Person person;
    private int orgunit;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    
    public int getOrgunit() {
        return orgunit;
    }

    public void setOrgunit(int orgunit) {
        this.orgunit = orgunit;
    }
}
