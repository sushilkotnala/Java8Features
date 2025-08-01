package com.java.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;

public class SampleFuture {

    public static CompletableFuture<String> getDVRVFromDB() {
        ForkJoinPool pool = new ForkJoinPool();
        // Getting DVRV from database
        return CompletableFuture.supplyAsync(() -> sleepAndPrint(5, "getDVRVFromDB"), pool);
    }

    public static String sleepAndPrint(int sleep, String method){
        sleep(method , sleep * 1000);
        System.out.println( method +" - " + Thread.currentThread());
        return method;
    }

    public static CompletableFuture<String> getMarketData(ForkJoinPool pool) {
        // Get MD
        return CompletableFuture.supplyAsync(() -> sleepAndPrint(2, "getMarketData"), pool);
    }

    public static Integer func(Integer param){
        sleepAndPrint(1, "func");
        System.out.println("Internal local work func method " + Thread.currentThread());
        return param + 1;
    }

    public static void main(String[] args) {

        //Prepare cahce

        //Prepare DVRV
        CompletableFuture dvRvFuture = getDVRVFromDB();

        //doing some local work
        CompletableFuture<Integer> future = new CompletableFuture();
        future.thenApply(e -> e * 2)
                .thenApply(e -> func(e))
                .thenAccept(System.out::println);

        future.complete(2);
        sleep("main", 1000);


        dvRvFuture.thenAcceptAsync(e -> System.out.println(e));
        sleep("main",1000);

        ForkJoinPool pool = new ForkJoinPool(2);
        CompletableFuture mdFuture = getMarketData(pool);
        mdFuture.thenAcceptAsync(e -> System.out.println(e));

        //do other calculation
        sleep("main",1000);
    }

    public static void sleep(String method, int sleep){
        try {
            System.out.println(method + " - sleeping for " + sleep + " seconds");
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

