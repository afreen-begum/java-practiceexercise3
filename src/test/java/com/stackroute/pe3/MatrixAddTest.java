package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAddTest {
    MatrixAdd matrixAdd;

    @Before
    public void setUp() throws Exception {
        matrixAdd = new MatrixAdd();
    }

    @After
    public void tearDown() throws Exception {
        matrixAdd = null;
    }

    @Test
    public void givenInputMatricesShouldReturnSumOfMatrices(){
        int[][] data1 = {{1,2},{3,4}};
        int[][] data2 = {{2,3},{5,5}};
        int[][] result = {{3,5},{8,9}};

        assertEquals(result,matrixAdd.additionMatrix(2,2,data1,data2));
    }

    @Test
    public void givenInputMatricesShouldReturnDifferentSum(){
        int[][] data1 = {{1,2},{3,4}};
        int[][] data2 = {{2,3},{5,5}};
        int[][] result = {{},{}};

        assertNotEquals(result,matrixAdd.additionMatrix(2,2,data1,data2));
    }

    @Test
    public void givenInputNullMatricesShouldReturnNull(){

        assertNull(matrixAdd.additionMatrix(2,2,null,null));
    }
}