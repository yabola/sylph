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
package ideal.sylph.parser.antlr.tree;

import com.github.harbby.gadtry.collection.mutable.MutableList;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.github.harbby.gadtry.base.MoreObjects.toStringHelper;
import static java.util.Objects.requireNonNull;

public final class ColumnDefinition
        extends TableElement
{
    private final Identifier name;
    private final String type;
    private final Optional<String> comment;

    public ColumnDefinition(NodeLocation location, Identifier name, String type, Optional<String> comment)
    {
        this(Optional.of(location), name, type, comment);
    }

    private ColumnDefinition(Optional<NodeLocation> location, Identifier name, String type, Optional<String> comment)
    {
        super(location);
        this.name = requireNonNull(name, "name is null");
        this.type = requireNonNull(type, "type is null");
        this.comment = requireNonNull(comment, "comment is null");
    }

    public Identifier getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public Optional<String> getComment()
    {
        return comment;
    }

    @Override
    public List<Node> getChildren()
    {
        return MutableList.of(name);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColumnDefinition o = (ColumnDefinition) obj;
        return Objects.equals(this.name, o.name) &&
                Objects.equals(this.type, o.type) &&
                Objects.equals(this.comment, o.comment);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, type, comment);
    }

    @Override
    public String toString()
    {
        return toStringHelper(this)
                .add("name", name)
                .add("type", type)
                .add("comment", comment)
                .toString();
    }
}
