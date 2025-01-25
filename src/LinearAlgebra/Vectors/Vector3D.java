package LinearAlgebra.Vectors;

public class Vector3D extends Vector{
    private double x;
    private double y;
    private double z;
    public final int size = 3;


    public Vector3D(double[] values) {
        super(values);
        if (values.length != 3){
            throw  new IllegalArgumentException("Vector must have exactly 3 dimensions");
        }
        this.x = values[0];
        this.y = values[1];
        this.z = values[2];
    }

    public Vector3D(double x, double y, double z){
        super(new double[] {x,y,z});
        this. x = x;
        this.y = y;
        this.z = z;
    }

    public static Vector3D x(){
        return new Vector3D(1,0,0);
    }

    public static Vector3D y(){
        return new Vector3D(0,1,0);
    }

    public static Vector3D z(){
        return new Vector3D(0,0,1);
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

    @Override
    public Vector Normalise(){
        return new Vector2D(this.x / this.z, this.y / this.z);
    }
}
