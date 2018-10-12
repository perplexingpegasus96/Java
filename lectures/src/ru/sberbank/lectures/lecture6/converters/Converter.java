package ru.sberbank.lectures.lecture6.converters;

import java.util.List;

public interface Converter<T> {
    T converter(List<Object> o) throws Exception;
}