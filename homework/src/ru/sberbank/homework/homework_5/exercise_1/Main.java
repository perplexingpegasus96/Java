package ru.sberbank.homework.homework_5.exercise_1;


public class Main{
    public static void main(String[] args) throws Exception {
        Task<Integer> task = new Task<>(() ->{
            Integer x = 0;
            for (int i = 0;i < 100_000_000;i++)
                x++;
            return x;
        });

        for (int i = 1;i < 4;i++){
            Thread thread = new Thread(() -> runTask(task), "Thread" + i);
            thread.start();
        }

    }

    private static void runTask(Task<Integer> task){
        try{
            Integer result = task.get();
            System.out.println(Thread.currentThread().getName() +
                                        " got the result = " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}