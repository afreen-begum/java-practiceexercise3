package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard chessBoard;

    @Before
    public void setUp() throws Exception {
        chessBoard = new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
        chessBoard = null;
    }

    @Test
    public void givenInputDataShouldPrintsAPattern(){
        assertEquals("pattern created",chessBoard.patternChessBoard(8,8));
    }

    @Test
    public void givenInputRowsAndColumnSizeShouldGiveAPattern(){
        assertEquals("pattern created",chessBoard.patternChessBoard(7,6));
    }

    @Test
    public void givenInputDataIsNotEqualsToOutput(){
        assertNotEquals("pattern not created",chessBoard.patternChessBoard(7,6));
    }

    @Test
    public void givenInputZeroShouldReturnANull(){
        assertNull(chessBoard.patternChessBoard(0,0));
    }

}