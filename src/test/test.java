package test;

import tools.math.series.Fibonacci;
import tools.math.series.Series;

public class test {
    public static void main(String[] args) {
        Series series = new Fibonacci(100000000);
        System.out.println(series.getSum());
    }
}
