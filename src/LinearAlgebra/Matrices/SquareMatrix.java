package LinearAlgebra.Matrices;

public class SquareMatrix extends Matrix{

    //TODO: implement gaussian reduction for calculating the determinant

    public int dimensions(){return this.rows;}
    public double determinant(){
        double product = 1;

        return product;
    }

    private double[][] rowEchelonForm(){
        double[][] values = new double[this.rows][this.rows];
        Boolean swapped = false;
        return values;
    }

    public SquareMatrix(double[][] values) {
        super(values);
        if (this.rows != this.columns) {
            throw  new IllegalArgumentException("Square matrix must have the same number of rows and columns");
        }
    }

    public SquareMatrix(int size) {
        super(createIdentityMatrix(size));
    }

    private static double[][] createIdentityMatrix(int size){
        double[][] values = new double[size][size];
        for (int k = 0; k < size; k++) {
            values[k][k] = 1;
        }
        return values;
    }

}
