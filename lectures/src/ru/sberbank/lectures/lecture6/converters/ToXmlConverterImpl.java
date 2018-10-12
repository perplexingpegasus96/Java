package ru.sberbank.lectures.lecture6.converters;

import java.lang.reflect.Field;
import java.util.List;

public class ToXmlConverterImpl<T> implements Converter<String> {
    @Override
    public String converter(List<Object> o) throws IllegalAccessException {
        StringBuilder xml = new StringBuilder();

        xml.append("<root>\n");

        for (Object item : o) {
            Class<?> clazz = item.getClass();
            String simpleName = clazz.getSimpleName();

            xml.append("\t<").append(simpleName).append(">\n");
            while (clazz != null) {
                for (Field field : clazz.getDeclaredFields()) {
                    field.setAccessible(true);
                    xml.append("\t\t<").append(field.getName()).append(">")
                            .append(field.get(item))
                            .append("</").append(field.getName()).append(">\n");
                }
                clazz = clazz.getSuperclass();
            }
            xml.append("\t</").append(simpleName).append(">\n");
        }

        xml.append("</root>");
        return xml.toString();
    }
}
