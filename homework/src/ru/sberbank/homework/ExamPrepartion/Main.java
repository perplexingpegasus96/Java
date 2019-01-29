package ru.sberbank.homework.ExamPrepartion;

import java.io.BufferedWriter;
import java.lang.reflect.Proxy;
import java.util.*;

public class Main {
    interface NumericTest{
        Integer compute(int n);
    }
    public static void main(String[] args){

        NumericTest result = (n) -> {
            for (int i = 1;i<=5;i++) n =n * i;
            return n;
        };
        System.out.println(result.compute(1));
    }


}
