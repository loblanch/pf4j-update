/*
 * Copyright (C) 2012-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pf4j.update;

import org.pf4j.PluginException;

/**
 * Marker exception for plugin verification failure
 */
public class VerifyException extends PluginException {
    public VerifyException(String message) {
        super(message);
    }

    public VerifyException(Throwable cause, String message, Object... args) {
        super(cause, message, args);
    }

    public VerifyException(String message, Object... args) {
        super(message, args);
    }
}
