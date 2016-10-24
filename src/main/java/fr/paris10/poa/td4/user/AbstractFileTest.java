package fr.paris10.poa.td4.user;


import fr.paris10.poa.td4.filesystem.*;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

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

public class AbstractFileTest {
    @Test
    public void maintest() {
        try {
            AbstractFileFactory factory = FileFactory.getFactory("Linux");
            File f1 = factory.createFile("f1.txt", "bob");
            assertEquals(factory.getName(f1), "f1.txt");
            assertEquals(factory.getId(f1), 0);
            assertEquals(factory.getUser(f1).getUid(), "bob");
            assertTrue(factory.open(f1, File.OpenMode.READ));
            assertFalse(factory.write(f1, "interdit"));
            assertFalse(factory.open(f1, File.OpenMode.WRITE));
            assertTrue(factory.close(f1));
            assertTrue(factory.open(f1, File.OpenMode.APPEND.WRITE));
            assertTrue(factory.write(f1, "contenu"));
            assertNull(factory.read(f1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*File f1 = new OrdinaryFile("f1.txt", "bob");
        assertEquals(f1.getName(), "f1.txt");
        assertEquals(f1.getId(), 0);
        assertEquals(f1.getUser().getUid(), "bob");
        assertTrue(f1.open(File.OpenMode.READ));
        assertFalse(f1.write("interdit"));
        assertFalse(f1.open(File.OpenMode.WRITE));
        assertTrue(f1.close());
        assertTrue(f1.open(File.OpenMode.WRITE));
        assertTrue(f1.write("contenu"));
        assertNull(f1.read());
        assertTrue(f1.close());
        assertNull(f1.read());
        assertTrue(f1.open(File.OpenMode.READ));
        assertEquals(f1.read(), "contenu");
        assertEquals(f1.size(), 7);
        assertTrue(f1.close());
        //
        File d1 = new Directory("d1", "bob");
        assertEquals(d1.getName(), "d1");
        assertEquals(d1.getId(), 1);
        assertEquals(d1.getUser().getUid(), "bob");
        assertTrue(d1.open(File.OpenMode.APPEND));
        assertTrue(d1.write("f2.txt"));
        File f2 = ((Directory) d1).getByName("fxxx.txt");
        assertNull(f2);
        f2 = ((Directory) d1).getByName("f2.txt");
        assertNotNull(f2);
        assertEquals(f2.getId(), 2);
        assertEquals(f2.getUser().getUid(), "bob");
        assertEquals(d1.size(), 1);
        assertTrue(d1.write("f3.txt"));
        File f3 = ((Directory) d1).getByName("f3.txt");
        assertNotNull(f3);
        assertEquals(f3.getId(), 3);
        assertEquals(f3.getUser().getUid(), "bob");
        assertEquals(d1.size(), 2);
        assertTrue(d1.close());
        //
        assertTrue(d1.open(File.OpenMode.WRITE));
        assertTrue(d1.write("f4.txt"));
        File f4 = ((Directory) d1).getByName("f4.txt");
        assertNull(((Directory) d1).getByName("f2.txt"));
        assertNull(((Directory) d1).getByName("f3.txt"));
        assertNotNull(f4);
        assertTrue(d1.close());
        */
    }
}