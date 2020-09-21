package com.java.features.function;

import java.util.function.Function;

public class FunctionMainClass {

    public static void main(String[] args) {

        Function<String, Integer> f = s -> s.length();

        System.out.println(f.apply("Sushil"));
        System.out.println(f.apply("Arjun"));
    }
}
