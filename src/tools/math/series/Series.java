package tools.math.series;

import tools.math.AlgorithmParam;
import tools.math.Limit;

public abstract class Series implements Limit {
    public abstract double getSum(AlgorithmParam param) throws IllegalArgumentException;
}
