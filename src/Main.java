import LinearAlgebra.Matrices.Matrix;
import LinearAlgebra.Vectors.Vector;
import LinearAlgebra.Vectors.Vector2D;
import LinearAlgebra.Vectors.Vector3D;

public class Main {
    public static void main(String[] args) {
        Matrix A = new Matrix(new double[][]{{1,2}, {3,4}});
        Matrix B = new Matrix(new double[][]{{1,2}, {3,4}, {5,6}});
        Vector2D V = new Vector2D(1,2);
        System.out.println(A.MatrixScalarProduct(5));
        System.out.println(Matrix.MatrixProduct(A,B));
        System.out.println(A.MatrixVectorProduct(V));
    }
}