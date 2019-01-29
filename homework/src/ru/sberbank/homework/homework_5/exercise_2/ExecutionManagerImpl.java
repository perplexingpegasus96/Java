package ru.sberbank.homework.homework_5.exercise_2;

import java.util.concurrent.ThreadPoolExecutor;

public class ExecutionManagerImpl implements ExecutionManager {
    @Override
    public Context execute(Runnable callback, Runnable... tasks) {
        ThreadPool threadPool = new ThreadPool(callback, 2, tasks);
        return new Context() {
            @Override
            public int getCompletedTaskCount() {
                return threadPool.getCompletedTasks();
            }

            @Override
            public int getFailedTaskCount() {
                return threadPool.getFailedTasks();
            }

            @Override
            public int getInterruptedTaskCount() {
                return threadPool.getInterruptedTasks();
            }

            @Override
            public void interrupt() {

            }

            @Override
            public boolean isFinished() {
                return threadPool.isFinished();

            }
        };
    }
}
