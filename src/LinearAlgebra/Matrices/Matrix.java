package LinearAlgebra.Matrices;

import LinearAlgebra.Vectors.Vector;

import java.util.Arrays;

public class Matrix {
    double[][] values;
    int rows;
    int columns;

    public Matrix(double[][] values){
        int rowSize = values[0].length;
        for (double[] column : values){
            if (column.length != rowSize){
                throw new IllegalArgumentException("Columns not the same length");
            }
        }
        this.columns = values.length;
        this.rows = rowSize;
        this.values = values;
    }

    public Matrix MatrixScalarProduct(double s){
        double[][] values = new double[this.rows][this.columns];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                values[i][j] = this.values[i][j] * s;
            }
        }
        return new Matrix(values);
    }

    public Vector MatrixVectorProduct(Vector V) throws IllegalArgumentException {
        if (this.columns != V.size()){
            throw new IllegalArgumentException("Vector length and matrix columns must be the same");
        }
        double[] values = new double[this.rows];
        for (int i = 0; i < this.rows; i++) {
            double sum = 0;
            for (int j = 0; j < this.columns; j++) {
                sum += this.values[j][i] * V.getValues()[j];
            }
            values[i] = sum;
        }
        return new Vector(values);
    }

    public Matrix Transpose(){
        double[][] values = new double[this.rows][this.columns];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                values[i][j] = this.values[j][i];
            }
        }
        return new Matrix(values);
    }

    public static Matrix MatrixProduct(Matrix A, Matrix B) throws IllegalArgumentException {
        if (A.columns != B.rows){
            throw new IllegalArgumentException("this matrix must have the same number of columns as the input matrix's rows");
        }
        double[][] values = new double[B.columns][A.rows];
        for (int i = 0; i < A.rows; i++) {
            for (int j = 0; j < B.columns; j++) {
                double sum = 0;
                for (int k = 0; k < A.columns; k++) {
                    sum += A.values[k][i] * B.values[j][k];
                }
            values[j][i] = sum;
            }
        }
        return new Matrix(values);
    }

    @Override
    public String toString(){
        return Arrays.deepToString(this.values);
    }

}
