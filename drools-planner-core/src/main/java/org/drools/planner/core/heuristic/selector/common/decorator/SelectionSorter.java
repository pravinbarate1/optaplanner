/*
 * Copyright 2012 JBoss Inc
 *
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
 */

package org.drools.planner.core.heuristic.selector.common.decorator;

import java.util.List;

import org.drools.planner.api.domain.entity.PlanningEntity;
import org.drools.planner.core.heuristic.selector.Selector;
import org.drools.planner.core.move.Move;
import org.drools.planner.core.score.director.ScoreDirector;

/**
 * Decides the order of a {@link List} of selection
 * (which is a {@link PlanningEntity}, a planningValue, a {@link Move} or a {@link Selector}).
 */
public interface SelectionSorter<T> {

    /**
     * @param scoreDirector never null, the {@link ScoreDirector}
     * which has the {@link ScoreDirector#getWorkingSolution()} to which the selections belong or apply to
     * @param selectionList never null, a {@link List}
     * of {@link PlanningEntity}, planningValue,  {@link Move} or {@link Selector}
     */
    void sort(ScoreDirector scoreDirector, List<T> selectionList);

}
