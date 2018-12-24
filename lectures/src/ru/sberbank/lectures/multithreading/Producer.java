package ru.sberbank.lectures.multithreading;

import java.util.ArrayList;
import java.util.List;

public class Producer {
    private final List<String> list = new ArrayList<>();

    public void runProduce() {
        while (true) {
            String element = createElement();
            System.out.println("Created " + element);

            synchronized (this) {
                if (list.size() > 10) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            synchronized (this) {
                list.add(element);
                this.notify();
            }
        }
    }


    private String createElement() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        return "11";
    }

    public void runConsumer() {
        while (true) {
            String remove;

            synchronized (this) {
                while (list.isEmpty()) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                    }
                }

                remove = list.remove(0);
                this.notify();
            }

            consume(remove);
        }
    }

    private void consume(String element) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Consumed " + element);
    }

    public static void main(String[] args) {
        Producer producer = new Producer();
        new Thread(() -> producer.runProduce()).start();
        new Thread(() -> producer.runConsumer()).start();
    }
}