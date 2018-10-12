package ru.sberbank.lectures.lecture6.calculator;

import java.util.HashMap;
import java.util.Map;

public class CalculatorCacheProxy implements Calculator {
    private final Map<Integer, Integer> cache = new HashMap<>();
    private final Calculator calculator;

    public CalculatorCacheProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int calc(int x) {
        if (cache.containsKey(x)) return cache.get(x);

        int result = calculator.calc(x);

        cache.put(x, result);
        return result;
    }
}
