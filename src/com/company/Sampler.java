package com.company;

public class Sampler {
    public static void main(String[] args) {
        Sample thing = new Sample();
        thing.height = 2.5f;
        thing.depth = 1.5f;
        thing.weight = 75.5f;

        System.out.println("Height:"+thing.height+ "feet");
        System.out.println("Weight:"+thing.weight + "Kg");
        System.out.println("Depth:"+ thing.depth+ "feet");

    }
}
