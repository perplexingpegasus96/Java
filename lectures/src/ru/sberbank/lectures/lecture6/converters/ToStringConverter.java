package ru.sberbank.lectures.lecture6.converters;

import java.util.List;

public class ToStringConverter implements Converter<String> {
    @Override
    public String converter(List<Object> o) {
        StringBuilder s = new StringBuilder();
        for (Object o1 : o) {
            s.append(o1.toString()).append("\n");
        }
        return s.toString();
    }
}
