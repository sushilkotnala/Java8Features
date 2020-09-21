package com.java.features.predicate;

import java.util.function.Predicate;

public class PredicateJoinsMainClass {

    public static void main(String[] args) {
        int [] arr = {0,5,7,2,3,9,1};
        Predicate<Integer> p = i -> (i>5);

        calculate(p, arr);
    }

    static void calculate(Predicate p, int[] arr) {
        for(int eachValue : arr) {
            if(p.test(eachValue)) {
                System.out.println(eachValue);
            }
        }
    }
}


