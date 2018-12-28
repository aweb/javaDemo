package advanced.thread;

/**
 * 通过继承Thread来创建线程
 * <p>
 * 创建一个线程的第二种方法是创建一个新的类，该类继承 Thread 类，然后创建一个该类的实例。
 * 继承类必须重写 run() 方法，该方法是新线程的入口点。它也必须调用 start() 方法才能执行。
 * 该方法尽管被列为一种多线程实现方式，但是本质上也是实现了 Runnable 接口的一个实例。
 * <p>
 * Thread 方法
 * <p>
 * 下表列出了Thread类的一些重要方法：
 * 序号	方法描述
 * 1	public void start() 使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
 * 2	public void run() 如果该线程是使用独立的 Runnable 运行对象构造的，则调用该 Runnable 对象的 run 方法；否则，该方法不执行任何操作并返回。
 * 3	public final void setName(String name) 改变线程名称，使之与参数 name 相同。
 * 4	public final void setPriority(int priority) 更改线程的优先级。
 * 5	public final void setDaemon(boolean on) 将该线程标记为守护线程或用户线程。
 * 6	public final void join(long millisec) 等待该线程终止的时间最长为 millis 毫秒。
 * 7	public void interrupt() 中断线程。
 * 8	public final boolean isAlive() 测试线程是否处于活动状态。测试线程是否处于活动状态。 上述方法是被Thread对象调用的。下面的方法是Thread类的静态方法。
 * <p>
 * 序号	方法描述
 * 1	public static void yield() 暂停当前正在执行的线程对象，并执行其他线程。
 * 2	public static void sleep(long millisec) 在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响。
 * 3	public static boolean holdsLock(Object x) 当且仅当当前线程在指定的对象上保持监视器锁时，才返回 true。
 * 4	public static Thread currentThread() 返回对当前正在执行的线程对象的引用。
 * 5	public static void dumpStack() 将当前线程的堆栈跟踪打印至标准错误流。
 */
public class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    ThreadDemo(String name) {
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
