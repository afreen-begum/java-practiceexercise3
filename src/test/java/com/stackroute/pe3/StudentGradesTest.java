package com.stackroute.pe3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradesTest {
    StudentGrades studentGrades;

    @Before
    public void setUp() throws Exception {
        studentGrades = new StudentGrades();
    }

    @After
    public void tearDown() throws Exception {
        studentGrades = null;
    }

    @Test
    public void givenInputdataShouldCheckForRange(){
        int[] data={30,40,50};
        assertEquals("within range",studentGrades.studentsGradesCheck(3,data));
    }

    @Test
    public void givenInputdataShouldChecksForRangeAndReturnsNotEqual(){
        int[] data={30,40,50};
        assertNotEquals("90",studentGrades.studentsGradesCheck(3,data));
    }

    @Test(expected = ArithmeticException.class)
    public void givenInputdataIsBeyondRangeSoReturnsException(){
        int[] data={140,150,150,120};

        assertEquals("Out of range",studentGrades.studentsGradesCheck(4,data));

    }

    @Test
    public void givenInputDataShouldReturnNull(){
        int[] data={ };
        assertNull(studentGrades.studentsGradesCheck(3,data));
    }



}