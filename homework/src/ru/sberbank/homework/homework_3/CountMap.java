package ru.sberbank.homework.homework_3;

import java.util.Map;


public interface CountMap<O>{
    // добавляет элемент в этот контейнер.
    void add(O element);

    //Возвращает количество добавлений данного элемента
    int getCount(O element);

    //Удаляет элемент и контейнера и возвращает количество его добавлений(до удаления)
    int remove(O element);

    //количество разных элементов
    int size();

    //Добавить все элементы из source в текущий контейнер, при совпадении ключей,суммировать значения
    void addAll(CountMap<O> source);

    //Вернуть java.util.Map. ключ - добавленный элемент, значение - количество его добавлений
    Map<O, Integer> toMap();

    //Тот же самый контракт как и toMap(), только всю информацию записать в destination
    void toMap(Map<O,Integer> destination);
}