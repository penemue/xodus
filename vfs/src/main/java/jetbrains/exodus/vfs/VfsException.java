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
package jetbrains.exodus.vfs;

import jetbrains.exodus.ExodusException;

@SuppressWarnings({"serial", "SerializableHasSerializationMethods", "UnusedDeclaration"})
public class VfsException extends ExodusException {

    public VfsException() {
    }

    public VfsException(String message) {
        super(message);
    }

    public VfsException(String message, Throwable cause) {
        super(message, cause);
    }

    public VfsException(Throwable cause) {
        super(cause);
    }
}
