/*
 * Copyright 2013 Netflix, Inc.
 *
 *      Licensed under the Apache License, Version 2.0 (the "License");
 *      you may not use this file except in compliance with the License.
 *      You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *      Unless required by applicable law or agreed to in writing, software
 *      distributed under the License is distributed on an "AS IS" BASIS,
 *      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *      See the License for the specific language governing permissions and
 *      limitations under the License.
 */
package com.netflix.nicobar.core.plugin;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

import com.netflix.nicobar.core.compile.ScriptArchiveCompiler;
import com.netflix.nicobar.core.internal.compile.NoOpCompiler;

/**
 * A {@link ScriptCompilerPlugin} for script archives with a no-op compiler included.
 * Intended for use during testing.
 *
 * @author Vasanth Asokan
 */
public class TestCompilerPlugin implements ScriptCompilerPlugin {

    public static final String PLUGIN_ID = "nolang";

    @Override
    public Set<? extends ScriptArchiveCompiler> getCompilers(Map<String, Object> compilerParams) {
        return Collections.singleton(new NoOpCompiler());
    }
}
