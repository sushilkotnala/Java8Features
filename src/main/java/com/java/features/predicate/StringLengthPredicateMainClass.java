package com.java.features.predicate;

import java.util.function.Predicate;

public class StringLengthPredicateMainClass {

    public static void main(String[] args) {
        Predicate<String> p = (String s) -> (s.length() < 5);

        System.out.println(p.test("Sushil"));
        System.out.println(p.test("ten"));
    }
}
