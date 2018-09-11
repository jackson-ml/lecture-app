package edu.haverford.cs.squirrelfactslec;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.Iterator;

import static org.junit.Assert.*;
import edu.haverford.cs.squirrelfactslec.SquirrelList;

public class SquirrelListTest {
    private Squirrel s1;
    private Squirrel s2;
    private SquirrelList l1;

    public SquirrelListTest() {
        s1 = new Squirrel("haverford black squirrel"
                ,"Haverford"
                , "http://squirrels.com/squirrel.png");
        s2 = new Squirrel("haverford brown squirrel"
                ,"Haverford"
                , "http://squirrels.com/squirrel.png");
        l1 = new SquirrelList();
    }

    @Test
    public void list_emptyGetFirst() {
        assertNotEquals(s1, l1.getFirst());
    }

    @Test
    public void list_getFirstAfterInsert() {
        assertEquals(s1, l1.add(s1).getFirst());
    }

    @Test
    public void list_canIterateToFirst() {
        assertEquals(true, l1.add(s1).iterator().hasNext());
    }

    @Test
    public void list_hasNextEmpty() {
        assertEquals(false, l1.iterator().hasNext());
    }

    @Test
    public void list_iteratorGetIndexOne() {
        l1.add(s2).add(s1);
        Iterator<Squirrel> i = l1.iterator();
        i.next();
        assertEquals(s2, i.next());
    }

    @Test
    public void list_size() {
        l1.add(s1).add(s1);
        assertEquals(2, l1.size());
    }
}
