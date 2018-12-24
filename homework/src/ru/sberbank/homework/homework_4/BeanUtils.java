package ru.sberbank.homework.homework_4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

public class BeanUtils {

    /**
     * Scans object "from" for all getters. If object "to"
     * contains correspondent setter, it will invoke it
     * to set property value for "to" which equals to the property
     * of "from".
     * <p/>
     * The type in setter should be compatible to the value returned
     * by getter (if not, no invocation performed).
     * Compatible means that parameter type in setter should
     * be the same or be superclass of the return type of the getter.
     * <p/>
     * The method takes care only about public methods.
     *
     * @param to   Object which properties will be set.
     * @param from Object which properties will be used to get values.
     */
    public static void assign(Object from, Object to) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method[] gettersListFrom = from.getClass().getDeclaredMethods();
        Method[] settersListTo = to.getClass().getDeclaredMethods();
        for (Method methodGet : gettersListFrom) {
            String getterName = methodGet.getName().substring(3);
            boolean getType = methodGet.getName().contains("get");
            for (Method methodSet : settersListTo) {
                String setterName = methodSet.getName().substring(3);
                boolean setType = methodSet.getName().contains("set");
                if ((getterName.equals(setterName)) &(getType) & (setType)){
                    Method mGet = from.getClass().getMethod("get" + getterName);
                    Object gottenAttr = mGet.invoke(from);
                    Object gottenAttrType = gottenAttr.getClass();

                    Method mSet = to.getClass().getMethod("set" + setterName, (Class<?>) gottenAttrType);
                    mSet.invoke(to, gottenAttr);//to.setName(from.getName)
                    //объект_класса.getClass() - используется для reflection класса
                    //класс.class - тоже самое
                }
            }
        }


    }
}