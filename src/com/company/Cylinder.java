package com.company;

/**
 * Created by miniMoimartz on 4/14/15.
 */
public class Cylinder extends Cuboid {
    //private instance data
    private int radius;
    //constructor
    public Cylinder(int height, int width, int length, int radius) {
        super(height, width, length);
        this.radius = radius;
    }
    //no param constructor
   public Cylinder(){
    }
    //Getter and Setter
    //RADIUS
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    //HEIGHT
    public int gettHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    //method to calculate surface area
    public double surfaceArea(int radius, int height){
        //variable to hold result
        double area;
        //formula
        area = Math.round(2 * Math.PI * radius * (radius + height));
        return area;
    }
    //method to calculate volume
    public double volume(int radius, int height){
        //variable to hold result
        double volume;
        //formula
        volume = Math.round(Math.PI * (radius * radius) * height);
        //return statement
        return volume;
    }
    public String toString() {
        return "Cylinder properties: " +
                "radius = " + radius +
                " height = " + height;
    }

}

