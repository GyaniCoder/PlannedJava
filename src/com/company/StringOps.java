package com.company;

import java.util.Locale;

public class StringOps {
    public static void main(String[] args) {
        String s1 = " Ganesh Sonke ";
        System.out.println(s1.length());
       System.out.println(s1.trim());
       s1 = s1.toUpperCase(Locale.ROOT);
       System.out.println(s1.trim());



    }
}
