package ru.sberbank.homework.homework_5.exercise_1;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String [] args){
        Task<Double>task = new Task<>(new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                double sum = 0.0;
                for(double i= 0;i<10;i++){
                    if(i%2 == 0)
                        sum += 2 * i + 1;
                    else
                        sum += 2 * i - 2;
                }
                return sum;
            }
        });


        for (int i = 0;i<3;i++){//создаем 3 потока
            Thread thread;
            thread = new Thread(new Runnable() {//создаем новый поток, передаем в него Runnable и имя потока
                @Override
                public void run() {
                    doRun(task);
                }
            }, "myThread#" + i);
            thread.start();
        }
    }

    private static void doRun(Task<Double> task) {//из остальных потоков получаем result был всегда первым
        try{
            Double result = task.get();//получаем результат работы callable
            System.out.println("Result of " + Thread.currentThread().getName() + ": " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
