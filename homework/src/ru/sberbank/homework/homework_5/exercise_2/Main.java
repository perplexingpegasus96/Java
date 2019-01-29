package ru.sberbank.homework.homework_5.exercise_2;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();
        ExecutionManager executionManager = new ExecutionManagerImpl();

        Runnable[] tasks = new Runnable[1000];
        for (int i = 0;i < 1000; i++){
            tasks[i] = (() -> {
                double x = 1000;
                double b;
                while (x != 0){
                    b = Math.pow(Math.cos(x), 2) + Math.pow(Math.sin(x), 2);
                    x--;
                }
            });
        }

        Runnable callback = () -> System.out.println("Tasks done!");

        Context context = executionManager.execute(callback, tasks);
        if (!context.isFinished()){
            while(!context.isFinished()){
                System.out.println(context.getCompletedTaskCount() + "/1000");
                Thread.sleep(5);
            }
        }

        System.out.println("delta1: " + (System.nanoTime() - start)/1_000_000);
    }
}
