package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare local variables
        int height, width, length, radius;

        //create scanner object
        Scanner scan = new Scanner(System.in);

        //ask user to enter values for cube, cyl, and prism
        System.out.println("Please enter height: ");
        //read input
        height = scan.nextInt();

        System.out.println("Please enter width: ");
        //read input
        width = scan.nextInt();

        System.out.println("Please enter length: ");
        //read input
        length = scan.nextInt();

        System.out.println("Please enter radius: ");
        //read input
        radius = scan.nextInt();

        //create objects
        Cuboid cube = new Cuboid(height, width, length);
        Cylinder cyl = new Cylinder(height, width, length, radius);
        triangularPrism prism = new triangularPrism(height, length, width);

        //System.out.println(cube.toString());
        //System.out.println(cyl.toString());
        //System.out.println(prism.toString());

        //CUBOID RESULTS
        System.out.println(cube.toString());
        System.out.println("The cuboid's surface area: " + cube.surfaceArea(width, length, height));
        System.out.println("The cuboid's volume: " + cube.volume(width, length, height));

        System.out.println("-------------------");

        //CYLINDER RESULTS
        System.out.println(cyl.toString());
        System.out.println("The cylinder's surface area: " + cyl.surfaceArea(radius, height));
        System.out.println("The cylinder's volume: " + cyl.volume(radius, height));

        System.out.println("-------------------");

        //TRIANGULAR PRISM RESULTS
        System.out.println(prism.toString());
        System.out.println("The prism's surface area: " + prism.prismSurfaceArea(width, height, length));
        System.out.println("The prism's volume: " + prism.prismVolume(width, height, length));





    }
}
