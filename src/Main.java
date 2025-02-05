import AffineGeometry.HomogeneousCoordinates;
import LinearAlgebra.Vectors.*;
import LinearAlgebra.Matrices.*;

public class Main {
    public static void main(String[] args) {
        Matrix A = new Matrix(new double[][]{{1,2}, {3,4}});
        Matrix B = new Matrix(new double[][]{{1,2}, {3,4}, {5,6}});
        Vector2D V = new Vector2D(1,2);
        System.out.println(A.MatrixScalarProduct(5));
        System.out.println(Matrix.MatrixProduct(A,B));
        System.out.println(A.MatrixVectorProduct(V));
        System.out.println(B.Transpose());
        HomogeneousCoordinates X = new HomogeneousCoordinates(new double[] {1,2,3});
        System.out.println(X);
    }
}