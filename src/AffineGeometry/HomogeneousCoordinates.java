package AffineGeometry;

import LinearAlgebra.Vectors.Vector4D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomogeneousCoordinates extends Vector4D {

    public HomogeneousCoordinates(double[] values) {
        super(values, true);
    }

    public HomogeneousCoordinates(double x, double y, double z){
        super(x,y,z, 1);
    }
}
