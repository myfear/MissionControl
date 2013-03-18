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
package net.eisele.mcontrl.web;

import java.io.Serializable;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

/**
 *
 * @author eiselem
 */
@Named
@FlowScoped("employee-flow")
public class EmployeeFlowBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int orgunit;

  

    public int getOrgunit() {
        return orgunit;
    }

    public void setOrgunit(int orgunit) {
        this.orgunit = orgunit;
    }

    public String returnToIndex() {
        return "/index";
    }

    public String newEmplyoee() {
        return "newEmployee";
    }
}
