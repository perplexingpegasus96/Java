package ru.sberbank.homework.ExamPrepartion;

public class Dog {
    private String name;
    private Integer age;

    Dog(String name, Integer age){
        this.name = name;
        this.age = age;
    }


    public String getDogsName() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.length();
    }

    public boolean equals(Dog dog){
            return this.hashCode() == dog.hashCode();
    }

}
