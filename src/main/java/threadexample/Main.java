package threadexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){

        //by Using ExecutorService you dont need to start thread
        //ExecutorService take care of starting your thread
        //ExecutorService add task to queue
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.submit(new ThreadExample());
        executorService.submit(() -> System.out.println("running thread by lambda"));

        executorService.shutdown();


    }
}
