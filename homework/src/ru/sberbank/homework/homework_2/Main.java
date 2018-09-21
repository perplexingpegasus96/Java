package ru.sberbank.homework.homework_2;

public class Main {
    public static void main(String[] args){
        Person dima = new PersonImpl("Dima",true);
        Person sveta = new PersonImpl("Sveta", false);

        dima.marry(sveta);
        System.out.println(dima.getSpouse().getName());
        System.out.println(sveta.getSpouse().getName());

        dima.divorce();
        sveta.divorce();
        System.out.println(dima.getSpouse());
        System.out.println(dima.getSpouse());


    }
}
