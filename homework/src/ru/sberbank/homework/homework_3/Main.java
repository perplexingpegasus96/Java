package ru.sberbank.homework.homework_3;

import java.util.Map;

public class Main {
    public static void main(String[] args){
        CountMap<Integer> map = new CountMapImpl<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

//        System.out.println(map.size());

//        int count1 = map.getCount(5); // 2
//        System.out.println(count1);
//        int count2 = map.getCount(6); // 1
//        System.out.println(count2);
//        int count3 = map.getCount(10); // 3
//        System.out.println(count3);
//
//        map.remove(10);
//        for(Map.Entry entry:map.toMap().entrySet()){
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }

        CountMap<Integer> newMap = new CountMapImpl<>();
        newMap.add(22);
        newMap.add(33);
        map.addAll(newMap);

//        for(Map.Entry entry:map.toMap().entrySet()){
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }

        CountMap<Integer> container = new CountMapImpl<>();

        map.toMap(container.toMap());
        for(Map.Entry entry:container.toMap().entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
