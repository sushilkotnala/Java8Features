package com.java.features.defaultInterface;

public class DinningSet implements Dimensions, Shape {

    @Override
    public void hasShape() {
        System.out.println("hasShape -> DinningSet");
    }
}
