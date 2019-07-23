package com.stackroute.pe3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels removeVowels;

    @Before
    public void setUp() throws Exception {
        removeVowels = new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
        removeVowels = null;
    }

    @Test
    public void givenInputCountryNamesShouldIgnoredVowels(){
        String[] data = {"India","United States","Germany","Egypt","czechoslovakia"};
        String[] result = {"Ind","Untd Stts","Grmny","Egypt","czchslvk"};

        assertEquals(result,removeVowels.vowelsIgnore(data));
    }

    @Test
    public void givenInputCountryNamesShouldNotIgnoresVowels(){
        String[] data = {"India","United States","Germany","Egypt","czechoslovakia"};
        String[] result = {"Ind","Untd",""};

        assertNotEquals(result,removeVowels.vowelsIgnore(data));
    }

    @Test
    public void givenInputNullDataShouldReturnNullOutput(){
        assertNull(removeVowels.vowelsIgnore(null));
    }
}