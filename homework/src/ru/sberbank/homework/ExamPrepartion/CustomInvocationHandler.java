package ru.sberbank.homework.ExamPrepartion;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {
    private Reader readerOriginal;

    public CustomInvocationHandler(Reader readerOriginal) {
        this.readerOriginal = readerOriginal;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("readLine")){
            System.out.println("Line was read!");
        }
        return method.invoke(readerOriginal, args);
    }
}
