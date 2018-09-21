package ru.sberbank.lectures.lecture3;

import java.util.Objects;

public class Person {
    private final String name;
//    private final int age;

    public Person(String name, int age){
        this.name = name;
//        this.age = age;
    }

//generated equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equalsIgnoreCase(person.name);
    }



    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase());
    }
}
