package ru.sberbank.lectures.lecture6;

public class Child extends Person {
    private int age = 10;

    @Override
    public String toString() {
        return "Child{" +
                "age=" + age +
                '}';
    }
}
