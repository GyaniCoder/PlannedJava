package com.company;

import java.awt.Point;

public class PointSetter {
    public static void main(String[] args) {
        Point location = new Point(4, 13);
        System.out.println("Starting location:");
        System.out.println("location x:"+ location.x);
        System.out.println("location y:"+ location.y);
        System.out.println("Moving to (7, 6)");
        location.x= 7;
        location.y= 6;

        System.out.println("Ending location is:");
        System.out.println("X equals:"+ location.x);
        System.out.println("Y equals:"+ location.y);

    }
}
