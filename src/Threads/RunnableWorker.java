package Threads;

public class RunnableWorker implements Runnable{
    @Override
    public void run() {
        System.out.println(String.format("Hello, I'm %s", Thread.currentThread().getName()));
    }
}
