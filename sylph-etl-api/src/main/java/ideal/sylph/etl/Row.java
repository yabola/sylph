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

import java.util.Arrays;

public interface Row
{
    String mkString(String seq);

    default String mkString()
    {
        return this.mkString(",");
    }

    <T> T getAs(String key);

    <T> T getAs(int i);

    default <T> T getField(int i)
    {
        return getAs(i);
    }

    int size();

    public static Row of(Object[] values)
    {
        return new DefaultRow(values);
    }

    static class DefaultRow
            implements Row
    {
        Object[] values;

        private DefaultRow(Object[] values)
        {
            this.values = values;
        }

        public Object[] getValues()
        {
            return Arrays.copyOf(values, values.length);
        }

        @Override
        public String mkString(String seq)
        {
            throw new UnsupportedOperationException("this " + this.getClass().getName() + " method have't mkString!");
        }

        @Override
        public String mkString()
        {
            throw new UnsupportedOperationException("this " + this.getClass().getName() + " method have't mkString!");
        }

        @Override
        public <T> T getAs(String key)
        {
            throw new UnsupportedOperationException("this " + this.getClass().getName() + " method have't T getAs(String)!");
        }

        @Override
        public <T> T getAs(int key)
        {
            throw new UnsupportedOperationException("this " + this.getClass().getName() + " method have't T getAs(int)!");
        }

        @Override
        public int size()
        {
            return values.length;
        }
    }
}
