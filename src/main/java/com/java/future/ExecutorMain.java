package com.java.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.LockSupport;

public class ExecutorMain {

    public static void main (String[] args) {

        var callable = new Callable<String>(){
            public String call(){
                LockSupport.parkNanos(10 * 1000 * 1000);
                System.out.println("inside workCallable method");
                return "callable";
            }
        };

        var runnable = new Runnable(){
            public void run(){
                System.out.println("inside workRunnable method");
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(runnable);
        var resp = executorService.submit(callable);
        try {
            System.out.println(resp.get());
        } catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
    }

}
