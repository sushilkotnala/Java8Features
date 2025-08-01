package com.java.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayCopy {

    public static void main(String[] args) {

       String[] a1 = {"a","b"};
        String[] a2 = {"e","f"};
//        Map result = ll.stream().map(e -> new AbstractMap.SimpleImmutableEntry<>( e.get(0), e.get(3))).
//                collect(Collectors.groupingBy(e -> e.getKey()));

        Arrays.stream(a1).collect(Collectors.toList()).addAll(Arrays.stream(a2).collect(Collectors.toList()));

 //       result.entrySet().forEach(System.out::println);

    }
}
