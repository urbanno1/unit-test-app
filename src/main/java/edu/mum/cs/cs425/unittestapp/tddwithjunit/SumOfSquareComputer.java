package edu.mum.cs.cs425.unittestapp.tddwithjunit;

import edu.mum.cs.cs425.unittestapp.tddwithjunit.service.ISquaresComputingService;

public class SumOfSquareComputer {

    private ISquaresComputingService squaresComputingService;
    public SumOfSquareComputer(ISquaresComputingService squaresComputingService) {
        this.squaresComputingService = squaresComputingService;
    }

    public  int computeSumOfSquares(int[] ints) {
        int[] sqrs = squaresComputingService.computerSquares(new int[]{1, 4, 9});
        int sum = 0;
        for (int i: sqrs) {
            sum += i;
        }
        return sum;
    }

}
