package ru.sberbank.lectures.lecture4;

import java.util.*;

public class iterator {

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        ListIterator<String> listIter = states.listIterator();

        while(listIter.hasPrevious()){
            System.out.println(listIter.previous());
        }
    }
}

