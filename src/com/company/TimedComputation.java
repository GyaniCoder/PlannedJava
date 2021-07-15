package com.company;

public class TimedComputation {
    public static void main(String[]args){
        long startTime;
        long endTime;
        double time;

        startTime = System.currentTimeMillis();
        System.out.println("Start time is: " + startTime);

        double width, height, hypotenuse;
        width = 42.7;
        height = 17;
        hypotenuse = Math.sqrt(width*width + height * height);
        System.out.println(hypotenuse);
        endTime = System.currentTimeMillis();
        time = (endTime - startTime)/1000.0;
        System.out.println("End time is:" + endTime);
        System.out.println(Math.sin(1));

        System.out.println("Run time in second was:" + time);

    }
}
