/**
 * Copyright 2010 - 2022 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.exodus.query

import jetbrains.exodus.entitystore.Entity
import java.util.*

class InMemoryBoundedHeapSortIterable(val capacity: Int, source: Iterable<Entity>, comparator: Comparator<Entity>) : InMemoryQueueSortIterable(source, comparator) {

    override fun createQueue(unsorted: Collection<Entity>): Queue<Entity> {
        val result = BoundedPriorityQueue(capacity, comparator)
        unsorted.forEach { result.offer(it) }
        return result
    }
}
