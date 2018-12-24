package ru.sberbank.homework.homework_5.exercise_2;

public interface ExecutionManager {
    Context execute(Runnable callback, Runnable... tasks);
}
