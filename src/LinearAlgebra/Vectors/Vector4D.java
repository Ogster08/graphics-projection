package LinearAlgebra.Vectors;

public class Vector4D extends Vector{
    private double x;
    private double y;
    private double z;
    private double w;
    public final int size = 4;


    public Vector4D(double[] values) {
        super(values);
        if (values.length != 4){
            throw  new IllegalArgumentException("Vector must have exactly 3 dimensions");
        }
        this.x = values[0];
        this.y = values[1];
        this.z = values[2];
        this.w = values[3];
    }

    public Vector4D(double x, double y, double z, double w){
        super(new double[] {x,y,z,w});
        this. x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public static Vector4D x(){
        return new Vector4D(1,0,0,0);
    }

    public static Vector4D y(){
        return new Vector4D(0,1,0,0);
    }

    public static Vector4D z(){
        return new Vector4D(0,0,1,0);
    }

    public static Vector4D w(){
        return new Vector4D(0,0,0,1);
    }

    public double getX(){
        return this.x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return this.y;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getZ(){
        return this.z;
    }

    public void setZ(double z){
        this.z = z;
    }

    public double getW(){
        return this.z;
    }

    public void setW(double w){
        this.w = w;
    }

    @Override
    public Vector Normalise(){
        return new Vector3D(this.x / this.w, this.y / this.w, this.z / this.w);
    }
}
