package Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread(); // main thread

        System.out.println("Name: " + t.getName());
        System.out.println("ID: " + t.getId());
        System.out.println("Alive: " + t.isAlive());
        System.out.println("Priority: " + t.getPriority());
        System.out.println("Daemon: " + t.isDaemon());

        t.setName("my-thread");
        System.out.println("New name: " + t.getName());
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);

        printIfDaemon(t);

        //The main thread is a starting place from which you may spawn new threads to perform your tasks.
        // To do that you have to write code to be executed in a separated thread and then start it.

        //Create custom threads
        //Java has two primary ways to create a new thread that performs a task you need.
        //by extending the Thread class and overriding its run method;
        ClassThread ct = new ClassThread();
        ct.start();

        //by implementing the Runnable interface and passing the implementation to the constructor of
        // the Thread class.
        HelloRunnable hr = new HelloRunnable();
        hr.run();

        Thread t1 = new ClassThread(); // a subclass of Thread
        t1.start();

        Thread t2 = new Thread(new HelloRunnable()); // passing runnable
        t2.start();

        Thread myThread = new Thread(new HelloRunnable(), "my-thread");
        myThread.start();

        Thread t3 = new Thread(() -> {
            System.out.println(String.format("Hello, I'm %s", Thread.currentThread().getName()));
        });
        t3.start();

        Thread t4 = new ClassThread(); // an object representing a thread
        t4.start();

        startingMultipleThreads();

        SquareWorkerThread swt = new SquareWorkerThread("threadio");
        swt.start();

        NumbersThread nt = new NumbersThread(1,4);
        nt.start();

        Thread tr1 = new Thread(new RunnableWorker(), "worker-1");
        Thread tr2 = new Thread(new RunnableWorker(), "worker-2");
        Thread tr3 = new Thread(new RunnableWorker(), "worker-3");
        tr1.start();
        tr2.start();
        tr3.start();

        MessageNotifier mn = new MessageNotifier("Hello Mary", 3);
        mn.start();

        Thread thread = new CustomThread();
        //thread.start();
        // If an error occurs inside a new thread we've created, the whole process will not be stopped:
        //thread.join(); // wait for thread with exception to terminate
        System.out.println("I am printed!"); // this line will be printed

        System.out.println("Started");
        Thread.sleep(2000L); // suspend current thread for 2000 millis
        System.out.println("Finished");

    }

    public static void printIfDaemon(Thread thread) {
        // implement logic
        if (thread.isDaemon()) {
            System.out.println("daemon");
        } else {
            System.out.println("not daemon");
        }
    }

    public static void startingMultipleThreads() {
        System.out.println("Starting...");
        Thread t1 = new ClassThread();
        Thread t2 = new ClassThread();

        t1.start();
        t2.start();

        System.out.println("Finished");
    }

    public static void startRunnables(Runnable[] runnables) {
        for(int i = 0; i < runnables.length; i++) {
            new Thread(runnables[i]).start();
        }
    }
}
