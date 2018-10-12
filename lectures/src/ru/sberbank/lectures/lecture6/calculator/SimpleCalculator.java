package ru.sberbank.lectures.lecture6.calculator;

public class SimpleCalculator implements Calculator {
    @Override
    public int calc(int x) {
        return x + 10;
    }
}
