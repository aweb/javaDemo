package examples;

import java.util.*;
import java.text.*;

/**
 * java.util 包提供了 Date 类来封装当前的日期和时间。 Date 类提供两个构造函数来实例化 Date 对象。
 * <p>
 * 序号	方法和描述
 * 1	boolean after(Date date) 若当调用此方法的Date对象在指定日期之后返回true,否则返回false。
 * 2	boolean before(Date date) 若当调用此方法的Date对象在指定日期之前返回true,否则返回false。
 * 3	Object clone( ) 返回此对象的副本。
 * 4	int compareTo(Date date) 比较当调用此方法的Date对象和指定日期。两者相等时候返回0。调用对象在指定日期之前则返回负数。调用对象在指定日期之后则返回正数。
 * 5	int compareTo(Object obj) 若obj是Date类型则操作等同于compareTo(Date) 。否则它抛出ClassCastException。
 * 6	boolean equals(Object date) 当调用此方法的Date对象和指定日期相等时候返回true,否则返回false。
 * 7	long getTime( ) 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
 * 8	int hashCode( ) 返回此对象的哈希码值。
 * 9	void setTime(long time) 用自1970年1月1日00:00:00 GMT以后time毫秒数设置时间和日期。
 * 10	String toString( ) 把此 Date 对象转换为以下形式的 String： dow mon dd hh:mm:ss zzz yyyy 其中： dow 是一周中的某一天 (Sun, Mon, Tue, Wed, Thu, Fri, Sat)。
 * <p>
 * 时间模式字符串用来指定时间格式。在此模式中，所有的 ASCII 字母被保留为模式字母，定义如下：
 * <p>
 * 字母	描述	示例
 * G	纪元标记	AD
 * y	四位年份	2001
 * M	月份	July or 07
 * d	一个月的日期	10
 * h	 A.M./P.M. (1~12)格式小时	12
 * H	一天中的小时 (0~23)	22
 * m	分钟数	30
 * s	秒数	55
 * S	毫秒数	234
 * E	星期几	Tuesday
 * D	一年中的日子	360
 * F	一个月中第几周的周几	2 (second Wed. in July)
 * w	一年中第几周	40
 * W	一个月中第几周	1
 * a	A.M./P.M. 标记	PM
 * k	一天中的小时(1~24)	24
 * K	 A.M./P.M. (0~11)格式小时	10
 * z	时区	Eastern Standard Time
 * '	文字定界符	Delimiter
 * "	单引号	`
 */
public class MyDate {
    public static void main(String args[]) {
        // 初始化 Date 对象
        Date date = new Date();
        // 使用 toString() 函数显示日期时间
        System.out.println(date.toString());
        //b的使用，月份简称
        String str = String.format(Locale.US, "英文月份简称：%tb", date);
        System.out.println(str);
        System.out.printf("本地月份简称：%tb%n", date);
        //B的使用，月份全称
        str = String.format(Locale.US, "英文月份全称：%tB", date);
        System.out.println(str);
        System.out.printf("本地月份全称：%tB%n", date);
        //a的使用，星期简称
        str = String.format(Locale.US, "英文星期的简称：%ta", date);
        System.out.println(str);
        //A的使用，星期全称
        System.out.printf("本地星期的简称：%tA%n", date);
        //C的使用，年前两位
        System.out.printf("年的前两位数字（不足两位前面补0）：%tC%n", date);
        //y的使用，年后两位
        System.out.printf("年的后两位数字（不足两位前面补0）：%ty%n", date);
        //j的使用，一年的天数
        System.out.printf("一年中的天数（即年的第几天）：%tj%n", date);
        //m的使用，月份
        System.out.printf("两位数字的月份（不足两位前面补0）：%tm%n", date);
        //d的使用，日（二位，不够补零）
        System.out.printf("两位数字的日（不足两位前面补0）：%td%n", date);
        //e的使用，日（一位不补零）
        System.out.printf("月份的日（前面不补0）：%te", date);


        /**
         * 使用 SimpleDateFormat 格式化日期
         *
         * SimpleDateFormat 是一个以语言环境敏感的方式来格式化和分析日期的类。SimpleDateFormat 允许你选择任何用户自定义日期时间格式来运行。
         */
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间为: " + ft.format(dNow));

        /**
         * printf 方法可以很轻松地格式化时间和日期。使用两个字母格式，它以 %t 开头并且以下面表格中的一个字母结尾
         *          转换符 说明 示例
         *          c 包括全部日期和时间信息 星期六 十月 27 14:21:20 CST 2007
         *          F "年-月-日"格式 2007-10-27
         *          D "月/日/年"格式 10/27/07
         *          r "HH:MM:SS PM"格式（12时制） 02:25:51 下午
         *          T "HH:MM:SS"格式（24时制）14:28:16
         *          R "HH:MM"格式（24时制）14:28
         */

        // 初始化 Date 对象
        Date date2 = new Date();

        //c的使用
        System.out.printf("全部日期和时间信息：%tc%n", date2);
        //f的使用
        System.out.printf("年-月-日格式：%tF%n", date2);
        //d的使用
        System.out.printf("月/日/年格式：%tD%n", date2);
        //r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date2);
        //t的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n", date2);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR%n", date2);

        // 使用toString()显示日期和时间
        System.out.printf("%1$s %2$tB %2$td, %2$tY%n", "Due date:", date2);
        // 显示格式化时间
        System.out.printf("%s %tB %<te, %<tY%n", "Due date2:", date);

        /**
         * Java 休眠(sleep)
         *
         * sleep()使当前线程进入停滞状态（阻塞当前线程），让出CPU的使用、目的是不让当前线程独自霸占该进程所获的CPU资源，以留一定时间给其他线程执行的机会。
         * 你可以让程序休眠一毫秒的时间或者到您的计算机的寿命长的任意段时间。例如，下面的程序会休眠3秒：
         */
        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(1000 * 3);   // 休眠3秒
            System.out.println(new Date() + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }

    }
}
