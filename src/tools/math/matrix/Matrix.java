package tools.math.matrix;

public class Matrix {
    private int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix.clone();
    }

    public Matrix(int row, int col){
        this.matrix = new int[row][col];
    }

    

    public int[][] getMatrix() {
        return matrix;
    }
}
