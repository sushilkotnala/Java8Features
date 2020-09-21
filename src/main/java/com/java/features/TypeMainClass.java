package com.java.features;

public class TypeMainClass {

   public static void main(String[] args) {

       var str = "String is jere";
       calc(1, "A");
       calc("S", "A");
   }

   private static <I,T>  void calc(I a, T v) {
       System.out.println(a);
       System.out.println(v);
   }

}

