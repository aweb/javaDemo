package examples;

/**
 * 数据类型
 */
public class DataType {
    // byte
    /**
     * byte 数据类型是8位、有符号的，以二进制补码表示的整数；
     *     最小值是 -128（-2^7）；
     *     最大值是 127（2^7-1）；
     *     默认值是 0；
     *     byte 类型用在大型数组中节约空间，主要代替整数，因为 byte 变量占用的空间只有 int 类型的四分之一；
     */
    static byte b1  = 100;
    // short
    /**
     *     short 数据类型是 16 位、有符号的以二进制补码表示的整数
     *     最小值是 -32768（-2^15）；
     *     最大值是 32767（2^15 - 1）；
     *     Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一；
     *     默认值是 0；
     */
    static short s1 = 100;
    // int
    /**
     *    int 数据类型是32位、有符号的以二进制补码表示的整数；
     *    最小值是 -2,147,483,648（-2^31）；
     *    最大值是 2,147,483,647（2^31 - 1）；
     *    一般地整型变量默认为 int 类型；
     *    默认值是 0 ；
     */
    static int i1 = 100000;
    // long
    /**
     *     long 数据类型是 64 位、有符号的以二进制补码表示的整数；
     *     最小值是 -9,223,372,036,854,775,808（-2^63）；
     *     最大值是 9,223,372,036,854,775,807（2^63 -1）；
     *     这种类型主要使用在需要比较大整数的系统上；
     *     默认值是 0L
     */
    static long l1 = 100000L;
    // float
    /**
     *     long 数据类型是 64 位、有符号的以二进制补码表示的整数；
     *     最小值是 -9,223,372,036,854,775,808（-2^63）；
     *     最大值是 9,223,372,036,854,775,807（2^63 -1）；
     *     这种类型主要使用在需要比较大整数的系统上；
     *     默认值是 0L
     */
    static float f1 = 234.5f;
    // double
    /**
     *     long 数据类型是 64 位、有符号的以二进制补码表示的整数；
     *     最小值是 -9,223,372,036,854,775,808（-2^63）；
     *     最大值是 9,223,372,036,854,775,807（2^63 -1）；
     *     这种类型主要使用在需要比较大整数的系统上；
     *     默认值是 0L
     */
    static double d1 = 123.45;
    // boolean
    /**
     * boolean数据类型表示一位的信息；
     * 只有两个取值：true 和 false；
     * 这种类型只作为一种标志来记录 true/false 情况；
     * 默认值是 false；
     */
    static boolean bo1 = false;
    // char
    /**
     * char类型是一个单一的 16 位 Unicode 字符；
     * 最小值是 \u0000（即为0）；
     * 最大值是 \uffff（即为65,535）；
     * char 数据类型可以储存任何字符；
     */
    static char c1 = 'A';
    // 常量 常量在程序运行时是不能被修改的。
    final double PI = 3.1415926;


    public static void main(String[] args) {
        // byte
        System.out.println(b1);
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println(s1);
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println(i1);
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println(l1);
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println(f1);
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println(d1);
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // boolean
        System.out.println(bo1);

        // char
        System.out.println(c1);
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);


        // 类型转换
        System.out.println();
        System.out.println("类型转换");
        char c2='a';//定义一个char类型
        int i2 = c2;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于"+i2);
        char c3 = 'A';//定义一个char类型
        int i3 = c3+1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于"+i3);

        int i4 = 123;
        byte b = (byte)i4;//强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值等于"+b);
    }

}
