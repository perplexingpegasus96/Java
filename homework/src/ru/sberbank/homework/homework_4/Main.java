package ru.sberbank.homework.homework_4;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Dog newDog = new Dog("Ben", 4,true,"huskey");
        Person newPerson = new Person("Max", 16, false,
                            "Russia", 0);

        System.out.println(newPerson.toString());
        BeanUtils.assign(newPerson, newDog);
        System.out.println(newDog.toString());
    }
}
