package com.java.features.predicate;

import java.util.function.Predicate;

public class PredicateMainCLass {

    public static void main(String[] args) {
        Predicate<Integer> p = i -> (i > 20);


        System.out.println(p.test(13));
        System.out.println(p.test(21));
        System.out.println(p.test(32));
    }
}
