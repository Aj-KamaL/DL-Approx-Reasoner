/*-
 * #%L
 * ELK Reasoner Core
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2011 - 2016 Department of Computer Science, University of Oxford
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.semanticweb.elk.reasoner.entailments.model;

import org.semanticweb.elk.reasoner.saturation.conclusions.model.ClassInconsistency;

/**
 * {@link org.semanticweb.elk.owl.interfaces.ElkSubClassOfAxiom
 * ElkSubClassOfAxiom} was entailed because inconsistency of
 * {@link org.semanticweb.elk.owl.interfaces.ElkSubClassOfAxiom#getSubClassExpression()
 * ElkSubClassOfAxiom.getSubClassExpression()} was derived.
 * <p>
 * {@link #getReason()} returns a {@link ClassInconsistency} with
 * {@link ClassInconsistency#getDestination()} corresponding to
 * {@link org.semanticweb.elk.owl.interfaces.ElkSubClassOfAxiom#getSubClassExpression()
 * ElkSubClassOfAxiom.getSubClassExpression()}.
 * 
 * @author Peter Skocovsky
 */
public interface SubClassInconsistencyEntailsSubClassOfAxiom extends
		SubClassOfAxiomEntailmentInference, HasReason<ClassInconsistency> {

	public static interface Visitor<O> {
		O visit(SubClassInconsistencyEntailsSubClassOfAxiom subClassInconsistencyEntailsSubClassOfAxiom);
	}

}
