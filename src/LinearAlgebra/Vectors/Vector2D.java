package LinearAlgebra.Vectors;

public class Vector2D extends Vector{
    private double x;
    private double y;
    public final int size = 2;

    public Vector2D(double[] values) {
        super(values);
        if (values.length != 2){
            throw  new IllegalArgumentException("Vector must have exactly 2 dimensions");
        }
        x = values[0];
        y = values[1];
    }

    public Vector2D(double x, double y){
        super(new double[]{x,y});
        this.x = x;
        this.y = y;
    }

    public Vector2D(){
        super(new double[] {0,0});
        this.x = 0;
        this.y = 0;
    }

    public static Vector2D x(){
        return new Vector2D(1,0);
    }

    public static Vector2D y(){
        return new Vector2D(0,1);
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

    @Override
    public Vector Normalise(){
        return new Vector(new double[]{this.x / this.y});
    }
}
