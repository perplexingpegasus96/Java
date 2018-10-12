package ru.sberbank.lectures.lecture6.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorCacheProxy(
                new HardWorkCalculator()
        );

        Calculator hardWorkCalculator = new HardWorkCalculator();

        System.out.println(calculator.calc(1));
        System.out.println(calculator.calc(2));
        System.out.println(calculator.calc(1));
    }
}
