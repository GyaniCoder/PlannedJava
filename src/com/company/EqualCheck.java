package com.company;

public class EqualCheck {
    public static void main(String[] args) {
        String str1, str2;
        str1 = "Boy this is awesome!";
        str2 = str1;
        System.out.println("String 1:" + str1);
        System.out.println("String 2:" + str2);
        System.out.println("Same object?:" + (str1 == str2));

        str2 = new String(str1);

        System.out.println("String 1 :" + str1);
        System.out.println("String 2 :" + str2);
        System.out.println("Same object?:" + (str1 == str2));
        System.out.println("Same object?:" + str1.equals(str2));
        boolean check1 = "Boy this is awesome!" instanceof String;
        System.out.println(check1);
    }
}
