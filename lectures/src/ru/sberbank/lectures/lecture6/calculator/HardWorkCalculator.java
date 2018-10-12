package ru.sberbank.lectures.lecture6.calculator;

public class HardWorkCalculator implements Calculator {
    @Override
    public int calc(int x) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        return x + 80;
    }
}
