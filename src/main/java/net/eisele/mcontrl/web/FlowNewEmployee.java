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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;

/**
 *
 * @author eiselem
 */
public class FlowNewEmployee implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger logger = Logger.getLogger(FlowNewEmployee.class.getName());

    public FlowNewEmployee() {
    }

    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
        logger.log(Level.INFO, "Building Flow! ");
        String flowId = "employee-flow";
        flowBuilder.id("unique", flowId);
        flowBuilder.returnNode("taskFlowReturn1").
                fromOutcome("#{employee.returnToIndex}");
        flowBuilder.navigationCase().fromAction("addEmployee").toViewId("addEmployee");
        return flowBuilder.getFlow();
    }
}
