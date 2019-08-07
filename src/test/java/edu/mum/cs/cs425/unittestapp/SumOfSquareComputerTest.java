package edu.mum.cs.cs425.unittestapp;

import edu.mum.cs.cs425.unittestapp.tddwithjunit.SumOfSquareComputer;
import edu.mum.cs.cs425.unittestapp.tddwithjunit.service.ISquaresComputingService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class SumOfSquareComputerTest {
    private SumOfSquareComputer sumOfSquareComputer = null;
    private ISquaresComputingService squaresComputingService = mock(ISquaresComputingService.class);

    public SumOfSquareComputerTest() {
        this.sumOfSquareComputer = new SumOfSquareComputer(squaresComputingService);
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        sumOfSquareComputer = null;
    }

    @Test
    public void computeSumOfSquares() {
//        int[] a_in = new int[]{1, 2, 3};
//        int expected = 14;
//        int actual = sumOfSquareComputer.computeSumOfSquares(a_in);
//        assertEquals(expected, actual);

        when(squaresComputingService.computerSquares(new int[]{1,2,3})).thenReturn(new int[] {1, 4, 9});


        int sumOfSquare = sumOfSquareComputer.computeSumOfSquares(new int[]{1, 2, 3});
        assertThat(sumOfSquare, is(14));
        verify(squaresComputingService).computerSquares(new int[]{1, 2, 3});
    }
}