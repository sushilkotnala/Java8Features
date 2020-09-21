package com.java.features.defaultInterface;

public class DefaultInterfaceMainClass {

    public static void main(String[] args) {
        Dimensions d = new Dimensions() {
            @Override
            public void hasShape() {
                System.out.println("hasShape -> Lambda");
            }
        };
        d.hasShape();
    }
}
