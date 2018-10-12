package ru.sberbank.lectures.lecture6;

import ru.sberbank.lectures.lecture6.converters.Converter;
import ru.sberbank.lectures.lecture6.converters.ToStringConverter;
import ru.sberbank.lectures.lecture6.converters.ToXmlConverterImpl;

import java.util.Arrays;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) throws Exception {
        Converter<String> converter = new ToXmlConverterImpl<>();
        String s = converter.converter(
                asList(new Child(), new Child())
        );

        System.out.println(s);
    }
}
