/*
 * Copyright 2016-2017 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.snowdrop.example.service;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public final class BookUtils {
    public static int generateNextId(Iterable<Book> all) {
        final Set<Integer> ids = new TreeSet<>(Collections.reverseOrder());
        all.forEach(fruit -> ids.add(fruit.getId()));
        return (ids.isEmpty() ? 1 : (ids.iterator().next() + 1));

    }
}
