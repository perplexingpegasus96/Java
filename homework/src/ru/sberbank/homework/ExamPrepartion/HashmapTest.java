package ru.sberbank.homework.ExamPrepartion;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class HashmapTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Dog dog = new Dog("Rex", 10);
        Dog dog1 = new Dog("Mark", 10);
        Dog dog2 = new Dog("Ale", 10);
        Dog dog3 = new Dog("ass", 10);

//
        HashMap<Dog, String> hashMap = new HashMap<>();
        hashMap.put(dog, "foo1");
        hashMap.put(dog1, "foo2");
        hashMap.put(dog2, "foo3");
        hashMap.put(dog3, "foo4");
        Integer a = 40;
        Integer b = 40;
        System.out.println(dog == dog2);
        System.out.println(hashMap.get(dog));
//        for (Map.Entry entry : hashMap.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
//        System.out.println(dog.equals(dog1));
    }
}



