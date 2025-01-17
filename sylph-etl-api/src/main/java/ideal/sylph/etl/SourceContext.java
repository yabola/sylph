/*
 * Copyright (C) 2018 The Sylph Authors
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
package ideal.sylph.etl;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

public interface SourceContext
        extends Serializable
{
    public default Schema getSchema()
    {
        throw new IllegalArgumentException("this method have't support!");
    }

    public default String getSourceTable()
    {
        throw new IllegalArgumentException("this method have't support!");
    }

    public default Map<String, Object> withConfig()
    {
        return Collections.emptyMap();
    }
}
