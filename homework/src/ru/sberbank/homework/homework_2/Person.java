package ru.sberbank.homework.homework_2;

public interface Person {
    boolean marry(Person person);

    boolean divorce();

    Person getSpouse();

    boolean getSex();

    String getName();
}
