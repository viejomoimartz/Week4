package com.company;

/**
 * Created by miniMoimartz on 4/14/15.
 */
public class Cuboid {
    //instance data
    protected int height;
    protected int width;
    protected int length;

    //constructor
    public Cuboid(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }
    //no param constructor
    public Cuboid() {
    }

    //GETTER AND SETTER
    //HEIGHT
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    //WIDTH
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    //LENGTH
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    //Method to calculate surface area
    public int surfaceArea(int width, int length, int height){
        //declare variable for area result
        int area;
        area = (2 * width * length) + (2 * length * height) + (2 * height * width);
        return area;
    }
    //Method to calculate volume
    public int volume(int width, int length, int height){
        //declare variable for area result
        int volume;
        volume = length * width * height;
        return volume;
    }
    @Override
    public String toString() {
        return "Cuboid properties: " +
                "height = " + height +
                ", width = " + width +
                ", length = " + length;
    }
}

