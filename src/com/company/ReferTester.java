package com.company;

import java.awt.Point;

public class ReferTester {
    public static void main(String[] args) {
        Point pt1, pt2, pt3;
        pt1 = new Point(100, 100);
        pt2 = new Point(100, 150);
        pt3 = pt1;

        pt1.x = 200;
        pt1.y = 200;

        System.out.println("Point 1 :" + pt1.x + "," + pt1.y);
        System.out.println("Point 2 :" + pt2.x + "," + pt2.y);
        System.out.println("Point 2 :" + pt3.x + "," + pt3.y);


    }

}
