package ru.sberbank.homework.ExamPrepartion;

public class UserCustomReader implements Reader, Writer{
     protected int x = 0;

    @Override
    public void readLine(){
        System.out.println("Custom readline");
    }

    @Override
    public void fuck() {
        System.out.println("fuck4real");
    }

    @Override
    public void write() {
        System.out.println("Writer");
    }
}
