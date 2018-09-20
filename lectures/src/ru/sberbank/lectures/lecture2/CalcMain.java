package ru.sberbank.lectures.lecture2;

public class CalcMain {
    public static void main(String[] args){
        Calculator calculator = new CalculatorImpl();
        int sum = calculator.sum("232", "2");
        System.out.println(sum);
    }
}
