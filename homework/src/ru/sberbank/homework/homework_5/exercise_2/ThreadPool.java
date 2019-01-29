package ru.sberbank.homework.homework_5.exercise_2;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {

    protected int completedTasks = 0;
    protected int failedTasks = 0;
    protected int interruptedTasks = 0;

    protected volatile boolean isRunning = true;
    protected int allTasks;
    protected int threadCount;
    protected Runnable callback;
    protected final ConcurrentLinkedQueue<Runnable>tasks = new ConcurrentLinkedQueue<>();



    public ThreadPool(Runnable callback, int threadCount, Runnable... tasks) {
        this.callback = callback;
        this.threadCount = threadCount;
        for (Runnable task : tasks) {
            this.tasks.offer(task);
        }
        this.allTasks = tasks.length + 1;

        //threads initiation
        for (int i = 1; i <= threadCount; i++) {
            Thread thread = new Thread(new Worker(), "Tread" + i);
            thread.start();
        }
    }

    public class Worker implements Runnable{
        @Override
        public void run() {
            while (!isFinished()){
                Runnable nextTask = tasks.poll();
                if (nextTask == null){
                    System.out.println(Thread.currentThread().getName() + " next task == null");
                    shutdown();
                }
                else{
                    if (isRunning){
                        try{
                            nextTask.run();
                            addCompletedTask();
                        }
                        catch (Throwable t){
                            addFailedTask();
                        }
                        finally {
                            if (isLastTask()){
                                System.out.println(Thread.currentThread().getName() +
                                        " got the last task!");
                                shutdown();
                            }
                        }
                    }
                }
            }
        }
    }

    public synchronized void interrupt(){
        interruptedTasks = allTasks - completedTasks - failedTasks;
        shutdown();
    }

    public synchronized boolean isFinished(){
        return !isRunning;
    }

    public synchronized int getCompletedTasks(){
        return completedTasks;
    }

    public synchronized int getFailedTasks(){
        return failedTasks;
    }

    public synchronized int getInterruptedTasks(){
        return interruptedTasks;
    }

    protected void shutdown() {
        if (isRunning){
            callback.run();
        }
        isRunning = false;
    }

    protected synchronized void addCompletedTask() {
        completedTasks++;
    }

    protected synchronized void addFailedTask() {
        failedTasks++;
    }

    protected synchronized boolean isLastTask() {
        return allTasks - failedTasks - completedTasks - interruptedTasks == 0;
    }
}
