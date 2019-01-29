package ru.sberbank.lectures.multithreading;

import static java.util.Objects.hash;

public class Main {
    private volatile boolean keepRunning = true;
    private int x;

    public void inc() {
        while (keepRunning) {
            ++x;
        }
        System.out.println("X=" + hash(x));
    }

    public void stop() {
        keepRunning = false;
    }

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        new Thread(()-> main.inc()).start();

        Thread.sleep(3);
        main.stop();
    }
}
