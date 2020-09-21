package com.java.features.defaultInterface;

public interface Dimensions {

    default void hasShape() {
        System.out.println("hasShape -> Dimensions");
    }
}
