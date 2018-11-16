package examples;

/**
 * Java 方法
 * <p>
 * 在前面几个章节中我们经常使用到 System.out.println()，那么它是什么呢？
 * <p>
 * println() 是一个方法。
 * System 是系统类。
 * out 是标准输出对象。
 * 这句话的用法是调用系统类 System 中的标准输出对象 out 中的方法 println()。
 * 那么什么是方法呢？
 * Java方法是语句的集合，它们在一起执行一个功能。
 * <p>
 * 方法是解决一类问题的步骤的有序组合
 * 方法包含于类或对象中
 * 方法在程序中被创建，在其他地方被引用
 * 方法的优点
 * 1. 使程序变得更简短而清晰。
 * 2. 有利于程序维护。
 * 3. 可以提高程序开发的效率。
 * 4. 提高了代码的重用性。
 * 方法的命名规则
 * 1.方法的名字的第一个单词应以小写字母作为开头，后面的单词则用大写字母开头写，不使用连接符。例如：addPerson。
 * 2.下划线可能出现在 JUnit 测试方法名称中用以分隔名称的逻辑组件。一个典型的模式是：test<MethodUnderTest>_<state>，例如 testPop_emptyStack。
 * 方法的定义
 * 一般情况下，定义一个方法包含以下语法：
 * <p>
 * 修饰符 返回值类型 方法名(参数类型 参数名){
 * ...
 * 方法体
 * ...
 * return 返回值;
 * }
 * 方法包含一个方法头和一个方法体。下面是一个方法的所有部分：
 * <p>
 * 修饰符：修饰符，这是可选的，告诉编译器如何调用该方法。定义了该方法的访问类型。
 * 返回值类型 ：方法可能会返回值。returnValueType 是方法返回值的数据类型。有些方法执行所需的操作，但没有返回值。在这种情况下，returnValueType 是关键字void。
 * 方法名：是方法的实际名称。方法名和参数表共同构成方法签名。
 * 参数类型：参数像是一个占位符。当方法被调用时，传递值给参数。这个值被称为实参或变量。参数列表是指方法的参数类型、顺序和参数的个数。参数是可选的，方法可以不包含任何参数。
 * 方法体：方法体包含具体的语句，定义该方法的功能。
 */
public class MyFunction {

    // 构造函数
    int x;

    MyFunction() {
        x = 10;
    }

    public static void main(String args[]) {
        // 构造函数
        MyFunction t1 = new MyFunction();
        MyFunction t2 = new MyFunction();
        System.out.println(t1.x + "<>" + t2.x);
        /**
         *命令行参数的使用
         * $ javac MyFunction.java
         * $ java MyFunction this is a command line 200 -100
         * args[0]: this
         * args[1]: is
         * args[2]: a
         * args[3]: command
         * args[4]: line
         * args[5]: 200
         * args[6]: -100
         */
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }

        // say hi
        MyFunction thisObj = new MyFunction();
        thisObj.hi();
        // 比较大小
        int max = max(4, 3);
        System.out.println("this max value is: " + max);
        // 方法重载
        double maxD = max(2.3, 2.29999);
        System.out.println("this double max value is: " + maxD);
        // 打印分数
        System.out.print("your Grade level is: ");
        printGrade(88);

        // 连续n次打印一个消息
        nPrintln("for times", 3);

        // 交换两个变量
        int num1 = 1;
        int num2 = 2;

        System.out.println("交换前 num1 的值为：" + num1 + " ，num2 的值为：" + num2);
        // 调用swap方法
        swap(num1, num2);
        System.out.println("交换后 num1 的值为：" + num1 + " ，num2 的值为：" + num2);

        // 调用可变参数的方法
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
    }

    /**
     * 可变参数
     */
    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }

    /**
     * 交换两个变量的方法
     */
    public static void swap(int n1, int n2) {
        System.out.println("\t进入 swap 方法");
        System.out.println("\t\t交换前 n1 的值为：" + n1 + "，n2 的值：" + n2);
        // 交换 n1 与 n2的值
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\t\t交换后 n1 的值为 " + n1 + "，n2 的值：" + n2);
    }

    /**
     * 返回两个整型变量数据的较大值
     */
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }

    /**
     * 方法的重载
     * <p>
     * 如果你调用max方法时传递的是int型参数，则 int型参数的max方法就会被调用；
     * 如果传递的是double型参数，则double类型的max方法体会被调用，这叫做方法重载；
     * 就是说一个类的两个方法拥有相同的名字，但是有不同的参数列表。
     * Java编译器根据方法签名判断哪个方法应该被调用。
     * 方法重载可以让程序更清晰易读。执行密切相关任务的方法应该使用相同的名字。
     * 重载的方法必须拥有不同的参数列表。你不能仅仅依据修饰符或者返回类型的不同来重载方法。
     */
    public static double max(double num1, double num2) {
        System.out.println("double max 方法重载被调用");
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    /**
     * void 关键字 打印分数
     */
    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println('A');
        } else if (score >= 80.0) {
            System.out.println('B');
        } else if (score >= 70.0) {
            System.out.println('C');
        } else if (score >= 60.0) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }

    /**
     * 通过值传递参数
     * <p>
     * 调用一个方法时候需要提供参数，你必须按照参数列表指定的顺序提供
     */
    public static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }

    public void hi() {
        System.out.println("hello world");
        hi2();
    }

    public void hi2() {
        System.out.println("Hi");
    }
}
