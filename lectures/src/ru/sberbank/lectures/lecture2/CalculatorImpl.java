package ru.sberbank.lectures.lecture2;

public class CalculatorImpl implements Calculator{
//    @Override
    public int sum(String arg1, String arg2){
        return  Integer.parseInt(arg1) + Integer.parseInt(arg2);
    }
}
