package Threads;

public class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println(2 / 0);
    }
}
