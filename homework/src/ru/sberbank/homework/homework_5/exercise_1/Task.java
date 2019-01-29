package ru.sberbank.homework.homework_5.exercise_1;

import java.util.concurrent.Callable;

class Task<T> {
    private Callable<? extends T> callable;
    private T result = null;

    Task(Callable<? extends T> callable){
        this.callable = callable;
    }

    T get() throws InterruptedException {
        if (result == null) {
            //очередь из тредов
            synchronized (this) {//double check from lectures
                //если к этому моменту результат уже посчитан, не входим в if
                if (result == null) {
                    try {
                        result = callable.call();
                        String firstThread = Thread.currentThread().getName();
                        System.out.println(firstThread + " was first!");
                        return result;
                    } catch (Exception e) {
                        throw new CallException("Exception in call()");
                    }
                }
            }
        }
        System.out.println("Result now is just gathered by "
                    + Thread.currentThread().getName());
        return result;
    }
}
