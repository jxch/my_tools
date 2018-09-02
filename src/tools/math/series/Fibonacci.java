package tools.math.series;

import tools.math.matrix.Matrix;

/**
 * Fibonacci 菲波那切数列：
 *  斐波那契数列（Fibonacci sequence），又称黄金分割数列、因数学家列昂纳多·斐波那契（Leonardoda Fibonacci）
 *  以兔子繁殖为例子而引入，故又称为“兔子数列”，
 *  指的是这样一个数列：1、1、2、3、5、8、13、21、34、……
 *  在数学上，斐波纳契数列以如下被以递归的方法定义：F(0)=0，F(1)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*）。
 */
public class Fibonacci extends Series{
    private int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    public Fibonacci(){}

    @Override
    public int getSum() {
        return getSum_recursion(this.n);
    }

    /**
     * 递归方法求和，时间复杂度O(N)，空间复杂度O(N)。
     * @param n int 最大数
     * @return 数列和 int
     */
    private int getSum_recursion(int n){
        if (0 == n || 1 == n){
            return 1;
        } else {
            return getSum_recursion(n - 1) + getSum_recursion(n - 2);
        }
    }

    /**
     * for循环求和，时间复杂度O(N)，空间复杂度O(1)。
     * @param n int 最大数
     * @return 数列和 int
     */
    private int getSum_loop(int n){
        int[] fibArr = {0,1,0};
        for (int i = 2; i<=n;++i){
            fibArr[2] = fibArr[0] + fibArr[1];
            fibArr[0] = fibArr[1];
            fibArr[1] = fibArr[2];
        }

        return fibArr[2];
    }


    /**
     * 线性代数递推式求和，时间复杂度(log n)，空间复杂的O(1)。
     * 主要是根据矩阵和快速幂运算的实现的：
     * 可以看出斐波那契数列有如下性质：(fn fn-1)=(fn-1 fn-2)*A,
     * 可以得出A=(1 1;1 0)递推可得：(fn fn-1)=(fn-1 fn-2)*A=(fn-2 fn-3)*A^2=…=(f1 f0)*A^(n-1)，
     * 因此问题转化为n次幂的问题，因此幂运算有这样的性质c^(a+b)=c^a*c^b,而n次幂的n可以拆成二进制的加法，
     * 所以只需要 log n 次遍历即可。
     * @param n int
     * @return 数列和 int
     */
    private int getSum_matrix(int n){
        Matrix A = new Matrix(new int[][]{{1,1},{1,0}});
        return 0;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
