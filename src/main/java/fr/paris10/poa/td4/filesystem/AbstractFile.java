package fr.paris10.poa.td4.filesystem;

/**
 * POA_Patterns
 * Copyright (C) 2016 lomhillah and pascalpoizat (@lhillah, @pascalpoizat)
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

public abstract class AbstractFile extends File {

    private static UserRegistry registry = new UserRegistry();
    private static int nextId = 0;

    private int id;
    private String name;
    private UserRegistry.User user;
    private OpenMode mode;
    private boolean open;

    AbstractFile(String name, String username) {
        this.id = nextId++;
        this.name = name;
        this.mode = null;
        this.open = false;
        this.user = registry.getAndCreateIfNeeded(username);
    }

    @Override
    public String toString() {
        return String.format("%s:%s %s", id, user, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractFile that = (AbstractFile) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    int getId() {
        return id;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    UserRegistry.User getUser() {
        return user;
    }

    @Override
    OpenMode getMode() {
        return mode;
    }

    @Override
    boolean open(OpenMode mode) {
        if (!open) {
            this.open = true;
            this.mode = mode;
            return true;
        } else {
            return false;
        }
    }

    @Override
    boolean close() {
        if (open) {
            this.open = false;
            this.mode = null;
            return true;
        } else {
            return false;
        }
    }

    @Override
    void rename(String name) {
        this.name = name;
    }

}
