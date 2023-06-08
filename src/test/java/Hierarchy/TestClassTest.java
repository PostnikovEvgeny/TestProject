package Hierarchy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClassTest {

    @Test
    void getScore() {
        Hierarchy.Test t = new Hierarchy.Test("Математика", 75);
        //int expectedScore = 75;
        assertTrue(t.getScore() == 75);
    }

    @Test
    void setLegalScore() {
        Hierarchy.Test t = new Hierarchy.Test("Математика", 75);
        t.setScore(55);
        assertTrue(t.getScore()==55);
    }
    @Test
    void setIllegalScore() {
        Hierarchy.Test t = new Hierarchy.Test("Математика", 75);
        assertThrows(IllegalArgumentException.class,()->
        {
            t.setScore(-1);
        });
    }

    @Test
    void randomInit() {
        Hierarchy.Test t = new Hierarchy.Test();
        t.RandomInit();
        String expectedName = t.getName();
        int expectedScore = t.getScore();
        assertTrue(expectedName == t.getName() && expectedScore == t.getScore());
    }

    @Test
    void testToString() {
        Hierarchy.Test t = new Hierarchy.Test();
        t.RandomInit();
        String expectedName = t.getName();
        int expectedScore = t.getScore();
        assertEquals(expectedName+" "+expectedScore,t.toString());
    }
}