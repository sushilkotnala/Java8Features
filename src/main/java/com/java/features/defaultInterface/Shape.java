package com.java.features.defaultInterface;

public interface Shape {

    default void hasShape() {
        System.out.println("hasShape -> Shape");
    }
}
