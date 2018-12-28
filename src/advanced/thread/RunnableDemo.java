package advanced.thread;

/**
 * 通过实现 Runnable 接口来创建线程
 * 创建一个线程，最简单的方法是创建一个实现 Runnable 接口的类。
 * 为了实现 Runnable，一个类只需要执行一个方法调用 run()，声明如下：
 * public void run()
 * <p>
 * 你可以重写该方法，重要的是理解的 run() 可以调用其他方法，使用其他类，并声明变量，就像主线程一样。
 * 在创建一个实现 Runnable 接口的类之后，你可以在类中实例化一个线程对象。
 * Thread 定义了几个构造方法，下面的这个是我们经常使用的：
 * Thread(Runnable threadOb,String threadName);
 * <p>
 * 这里，threadOb 是一个实现 Runnable 接口的类的实例，并且 threadName 指定新线程的名字。
 * 新线程创建之后，你调用它的 start() 方法它才会运行。
 * void start();
 */
class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

