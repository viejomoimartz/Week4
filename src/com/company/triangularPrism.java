package com.company;

/**
 * Created by miniMoimartz on 4/14/15.
 */
public class triangularPrism extends Cuboid{
    //instance data
    //constructor
    public triangularPrism(int height, int length, int width){

        this.height = height;
        this.length = length;
        this.width = width;
    }
    //no param constructor
    public triangularPrism(){

    }
    //Getters and Setters
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    //surface area method
    public double prismSurfaceArea(int width, int height, int length){
        //declare local variables
        int baseArea;
        double area;
        //calculate area of base
        baseArea = height * width;
        //formula
        area = ((2 * baseArea) + (width * length));
        return area;
    }
    //volume method
    public double prismVolume(int width, int height, int length){
        //declare local variables
        int baseArea;
        double volume;
        //calculate base area
        baseArea = height * width;
        //formula
        volume = baseArea * length;
        return volume;
    }
    //toString method
    public String toString() {
        return "Prism info: " +
                "height = " + height +
                " width = " + width +
                " length = " + length;
    }
}


