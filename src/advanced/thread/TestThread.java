package advanced.thread;

public class TestThread {

    public static void main(String args[]) {
        RunnableDemo R1 = new RunnableDemo("Runnable-A");
        R1.start();

        RunnableDemo R2 = new RunnableDemo("Runnable-B");
        R2.start();

        ThreadDemo t1 = new ThreadDemo("Thread-A");
        t1.start();

        ThreadDemo t2 = new ThreadDemo("Thread-B");
        t2.start();
    }
}