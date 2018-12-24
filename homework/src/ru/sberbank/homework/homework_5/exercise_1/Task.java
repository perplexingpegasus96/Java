package ru.sberbank.homework.homework_5.exercise_1;

import java.util.concurrent.Callable;

public class Task<T> {

    private Callable<? extends T> callable;
    private T result;
    private boolean isFirstThread;


    public Task(Callable<? extends T> callable){
        this.callable = callable;
        this.isFirstThread = true;
    }

    public T get() throws InterruptedException{
        synchronized (this){//синхронизируем процессы(когда один использует другие ждут)
            if (isFirstThread){//первый поток который первый вызвал метод get
                try{
                    System.out.println(Thread.currentThread().getName() + " came first");
                    result = callable.call();
                    isFirstThread = false;
                } catch (Exception e) {
                    throw new CallException("Call Exception!");
                }
            }
        }

        return result;
    }

}
