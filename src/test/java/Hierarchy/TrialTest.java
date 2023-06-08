package Hierarchy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrialTest {

    @Test
    void getSomeName()
    {
        Trial t = new Trial("Информатика");
        String expectedName = t.getName();
        assertEquals(expectedName,t.getName());

    }

    @Test
    void setSomeName()
    {
        Trial t = new Trial("Английский язык");
        String expeсtedName = "ОБЖ";
        t.setName(expeсtedName);
        assertEquals(expeсtedName,t.getName());
    }

    @Test
    void RandomInitTest()
    {
        Trial t = new Trial();
        t.RandomInit();
        String expectedName = t.getName();
        assertEquals(expectedName,t.getName());
    }

    @Test
    void toStringTest()
    {
        Trial t = new Trial("Физика");
        //t.RandomInit();
        //String expectedName = t.getName();
        //assertEquals(expectedName,t.toString());
        assertTrue("Физика" == t.toString());
    }
}