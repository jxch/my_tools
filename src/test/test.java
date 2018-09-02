package test;

import tools.math.AlgorithmParam;
import tools.math.series.Fibonacci;
import tools.math.series.Series;

public class test {
    public static void main(String[] args) {
        Series series = new Fibonacci(500);
        long startTime = System.currentTimeMillis();
        System.out.println(series.getSum(AlgorithmParam.LOOP));
        long endTime = System.currentTimeMillis();
        System.out.println("LOOP : " + (endTime - startTime));

//        startTime = System.currentTimeMillis();
//        System.out.println(series.getSum(AlgorithmParam.RECURSION));
//        endTime = System.currentTimeMillis();
//        System.out.println("RECURSION : " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        System.out.println(series.getSum(AlgorithmParam.OPTIMAL));
        endTime = System.currentTimeMillis();
        System.out.println("OPTIMAL : " + (endTime - startTime));
    }
}
