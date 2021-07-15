package com.company;

public class BasicHumanDemo {
    public static void main(String[] args){
        Human human = new Human();
        human.setName("Ganesh");
        human.setAge(24);
        human.setHeight(5.8f);
        System.out.println("Name is:" + human.getName());
        System.out.println("age is:" + human.getAge());
        System.out.println("height is:"+ human.getHeight());
    }
}
