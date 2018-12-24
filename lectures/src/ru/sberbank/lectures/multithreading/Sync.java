package ru.sberbank.lectures.multithreading;

import java.util.ArrayList;
import java.util.List;

public class Sync {
    static Object lock = new Object();

    static int counter;

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(() -> doRun(), "myThread_" + i);
            thread.start();
            threads.add(thread);
        }
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Counter " + counter);
    }

    private static void doRun() {
        for (int i = 0; i < 100_000; i++) {
            ++counter;
        }
    }

    private static void increment() {
        synchronized (lock) {
            counter = counter + 1;
        }
    }

    private synchronized static void increment2() {
        synchronized (Sync.class) {
            counter = counter + 1;
        }
    }

    private synchronized void increment3() {
        synchronized (this) {
            counter = counter + 1;
        }
    }
}
