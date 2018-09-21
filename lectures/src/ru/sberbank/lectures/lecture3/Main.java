package ru.sberbank.lectures.lecture3;

//ctrl + N = get to class
//ctrl + F12 = see class methods

public class Main {
    public static void main(String[] args){
        String x = "100";
        String y = "101";
//
//        Person oleg = new Person("Oleg", 22);
//        Person dima = new Person("oleg", 22);
//
//        System.out.println(oleg.hashCode());
//        System.out.println(dima.hashCode());
//
//        System.out.println(oleg.equals(dima));

//        System.out.println(x == y);//false(check that this is the same object)
//        System.out.println(x.equals(y));//true(

//        System.out.println(x.compareTo(y));

        StringBuilder s = new StringBuilder("hello");//work with strings inplace

        for(int i = 0; i < 10;i++)
            s.append(i);

//        String new_s = s.replace(",", " ");
        System.out.println(s);
        System.out.println("qwqw" + "oleg");


    }
}
