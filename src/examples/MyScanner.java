package examples;

import java.util.Scanner;

/**
 * java.util.Scanner 是 Java5 的新特征，我们可以通过 Scanner 类来获取用户的输入。
 * <p>
 * 下面是创建 Scanner 对象的基本语法：
 * <p>
 * Scanner s = new Scanner(System.in);
 * 接下来我们演示一个最简单的数据输入，并通过 Scanner 类的 next() 与 nextLine() 方法获取输入的字符串，在读取前我们一般需要 使用 hasNext 与 hasNextLine 判断是否还有输入的数据：
 */
public class MyScanner {
    public static void main(String[] args) {

        /**
         * next() 与 nextLine() 区别
         *
         * next():
         *
         * 1、一定要读取到有效字符后才可以结束输入。
         * 2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
         * 3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
         * next() 不能得到带有空格的字符串。
         *
         * nextLine()：
         *
         * 1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
         * 2、可以获得空白。
         * 如果要输入 int 或 float 类型的数据，在 Scanner 类中也有支持，但是在输入之前最好先使用 hasNextXxx() 方法进行验证，再使用 nextXxx() 来读
         */

        /**
         * next
         */
//        Scanner scan = new Scanner(System.in);
//        // 从键盘接收数据
//
//        // next方式接收字符串
//        System.out.println("next方式接收：");
//        // 判断是否还有输入
//        if (scan.hasNext()) {
//            String str1 = scan.next();
//            System.out.println("输入的数据为：" + str1);
//        }
//        scan.close();

        /**
         * nextLine
         */
        Scanner scan2 = new Scanner(System.in);
        // 从键盘接收数据
        // nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        if (scan2.hasNextLine()) {
            String str2 = scan2.nextLine();
            System.out.println("输入的数据为：" + str2);
        }
        scan2.close();
    }
}
