package ru.sberbank.lectures.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Vol {
    private List<String> strings = new CopyOnWriteArrayList<>();

    public int size() {
        return strings.size();
    }

    public List<String> getStrings() {
        return new ArrayList<>(strings);
    }

    public synchronized void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public void add(String v) {
        strings.add(v);
    }
}
