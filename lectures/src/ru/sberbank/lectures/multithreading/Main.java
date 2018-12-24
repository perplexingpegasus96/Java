package ru.sberbank.lectures.multithreading;

public class Main {
    private volatile boolean keepRunning = true;
    private int x;

    public void inc() {
        while (keepRunning) {
            ++x;
        }
        System.out.println("X=" + x);
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
