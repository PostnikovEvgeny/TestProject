package Hierarchy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

    @Test
    void getMark() {
        Exam e = new Exam("Химия",'A');
        assertTrue(e.getMark()=='A');
    }
    @Test
    void setAMark() {
        Exam e = new Exam();
        e.setName("Химия");
        e.setMark('A');
        assertTrue(e.getMark()=='A');
    }
    @Test
    void setBMark() {
        Exam e = new Exam();
        e.setName("Химия");
        e.setMark('B');
        assertTrue(e.getMark()=='B');
    }
    @Test
    void setCMark() {
        Exam e = new Exam();
        e.setName("Химия");
        e.setMark('C');
        assertTrue(e.getMark()=='C');
    }
    @Test
    void setDMark() {
        Exam e = new Exam();
        e.setName("Химия");
        e.setMark('D');
        assertTrue(e.getMark()=='D');
    }
    @Test
    void setEMark() {
        Exam e = new Exam();
        e.setName("Химия");
        e.setMark('E');
        assertTrue(e.getMark()=='E');
    }
    @Test
    void setFMark() {
        Exam e = new Exam();
        e.setName("Химия");
        e.setMark('F');
        assertTrue(e.getMark()=='F');
    }
    @Test
    void setIllegalMark() {
        Exam e = new Exam();
        e.setName("Химия");
        assertThrows(IllegalArgumentException.class,()->
        {
           e.setMark('V');
        });
    }

    @Test
    void randomInit() {
        Exam e = new Exam();
        e.RandomInit();
        String expectedName = e.getName();
        char expectedMark = e.getMark();
        assertTrue(expectedName == e.getName() && expectedMark == e.getMark());
    }

    @Test
    void testToString() {
        Exam e = new Exam();
        e.RandomInit();
        String expectedName = e.getName();
        char expectedMark = e.getMark();
        assertEquals(expectedName+" "+expectedMark,e.toString());
    }
}