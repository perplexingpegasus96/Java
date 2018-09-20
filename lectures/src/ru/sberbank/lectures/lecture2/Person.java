package ru.sberbank.lectures.lecture2;

public interface Person {
    boolean marry(Person person);

    boolean divorce();

    Person getSpouse();

    boolean getSex();

    String getName();
}
