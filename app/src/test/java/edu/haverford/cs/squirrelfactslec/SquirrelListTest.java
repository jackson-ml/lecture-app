package edu.haverford.cs.squirrelfactslec;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.haverford.cs.squirrelfactslec.SquirrelList;

public class SquirrelListTest {
    @Test
    public void addition_isCorrect() {
        Squirrel s = new Squirrel("haverford black squirrel"
                ,"Haverford"
                , "http://squirrels.com/squirrel.png");
        assertNotEquals(s, (new SquirrelList()).getFirst());
    }

}
