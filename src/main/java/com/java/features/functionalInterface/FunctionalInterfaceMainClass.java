package com.java.features.functionalInterface;

import com.java.features.functionalInterface.Calculate;

public class FunctionalInterfaceMainClass {

    public static void main(String[] args) {

        Calculate add = (x,y) -> x +y;
        System.out.println(add.get(2,3));

        Calculate  mult = (x,y) -> x * y;
        System.out.println(mult.get(2,3));
    }
}
