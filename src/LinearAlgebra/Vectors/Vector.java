package LinearAlgebra.Vectors;

import java.util.Arrays;

public class Vector {
    //TODO: Make all subclass variables like x,y,z,w dependant on the values variable

    protected double[] values;

    public Vector(double[] values){
        this.values = values;
    }

    public int size(){
        return this.values.length;
    }

    public final double length(){
        double sum = 0;
        for (double d : this.values){
            sum += d*d;
        }
        return Math.sqrt(sum);
    }

    public double[] getValues(){
        return this.values;
    }

    public void setValues(double[] values){
        this.values = values;
    }

    public double dotProduct(Vector vector) throws IllegalArgumentException {
        if (vector.size() != this.size()){
            throw new IllegalArgumentException("Vectors must have the same dimension, the 2 dimensions are %d & %d".formatted(this.size(), vector.size()));
        }
        double sum = 0;
        for (int i = 0; i < this.size(); i++) {
            sum += this.values[i] * vector.values[i];
        }
        return sum;
    }

    public Vector scalarMultiplication(double s){
        double[] values = new double[this.size()];
        for (int i = 0; i < this.size(); i++) {
            values[i] = this.values[i] * s;
        }
        return new Vector(values);
    }

    public Vector Normalise(){
        double[] newValues = new double[this.size()-1];
        for (int i = 0; i < this.size()-1; i++) {
            newValues[i] = this.values[i] / this.values[this.size()-1];
        }
        return new Vector(newValues);
    }

    @Override
    public String toString(){
        return Arrays.toString(this.values);
    }
}