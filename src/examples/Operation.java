package examples;

/**
 * Java 运算符
 * <p>
 * 计算机的最基本用途之一就是执行数学运算，作为一门计算机语言，Java也提供了一套丰富的运算符来操纵变量。我们可以把运算符分成以下几组：
 * <p>
 * 算术运算符
 * 关系运算符
 * 位运算符
 * 逻辑运算符
 * 赋值运算符
 * 其他运算符
 */
public class Operation {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        // 算术运算符
        /**
         * 算术运算符用在数学表达式中，它们的作用和在数学中的作用一样。下表列出了所有的算术运算符。
         *
         * 表格中的实例假设整数变量A的值为10，变量B的值为20：
         *
         * 操作符	描述	例子
         * +	加法 - 相加运算符两侧的值	A + B 等于 30
         * -	减法 - 左操作数减去右操作数	A – B 等于 -10
         * *	乘法 - 相乘操作符两侧的值	A * B等于200
         * /	除法 - 左操作数除以右操作数	B / A等于2
         * ％	取余 - 左操作数除以右操作数的余数	B%A等于0
         * ++	自增: 操作数的值增加1	B++ 或 ++B 等于 21（区别详见下文）
         * --	自减: 操作数的值减少1	B-- 或 --B 等于 19（区别详见下文）
         */
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("a--   = " + (a--));
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));

        // 自增自减运算符
        /**
         * 自增（++）自减（--）运算符是一种特殊的算术运算符，在算术运算符中需要两个操作数来进行运算，而自增自减运算符是一个操作数。
         */
        System.out.println();
        int a1 = 3;//定义一个变量；
        int b1 = ++a1;//自增运算
        int c1 = 3;
        int d1 = --c1;//自减运算
        System.out.println("进行自增运算后的值等于" + b1);
        System.out.println("进行自减运算后的值等于" + d1);
        // 前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算。
        // 后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算。
        int a2 = 5;//定义一个变量；
        int b2 = 5;
        int x = 2 * ++a2;
        int y = 2 * b2++;
        System.out.println("自增运算符前缀运算后a=" + a2 + ",x=" + x);
        System.out.println("自增运算符后缀运算后b=" + b2 + ",y=" + y);

        // 关系运算符
        /**
         * 下表为Java支持的关系运算符
         *
         * 表格中的实例整数变量A的值为10，变量B的值为20：
         *
         * 运算符	描述	例子
         * ==	检查如果两个操作数的值是否相等，如果相等则条件为真。	（A == B）为假(非真)。
         * !=	检查如果两个操作数的值是否相等，如果值不相等则条件为真。	(A != B) 为真。
         * > 	检查左操作数的值是否大于右操作数的值，如果是那么条件为真。	（A> B）非真。
         * < 	检查左操作数的值是否小于右操作数的值，如果是那么条件为真。	（A <B）为真。
         * >=	检查左操作数的值是否大于或等于右操作数的值，如果是那么条件为真。	（A> = B）为假。
         * <=	检查左操作数的值是否小于或等于右操作数的值，如果是那么条件为真。	（A <= B）为真。
         */
        int a3 = 10;
        int b3 = 20;
        System.out.println();
        System.out.println("关系运算符");
        System.out.println("a3 != b3 = " + (a3 != b3));
        System.out.println("a3 == b3 = " + (a3 == b3));
        System.out.println("a3 > b3 = " + (a3 > b3));
        System.out.println("a3 < b3 = " + (a3 < b3));
        System.out.println("b3 >= a3 = " + (b3 >= a3));
        System.out.println("b3 <= a3 = " + (b3 <= a3));

        // 位运算
        /**
         * Java定义了位运算符，应用于整数类型(int)，长整型(long)，短整型(short)，字符型(char)，和字节型(byte)等类型。
         * 位运算符作用在所有的位上，并且按位运算。假设a = 60，b = 13;它们的二进制格式表示将如下：
         * A = 0011 1100
         * B = 0000 1101
         * -----------------
         * A&b = 0000 1100
         * A | B = 0011 1101
         * A ^ B = 0011 0001
         * ~A= 1100 0011
         *
         * 下表列出了位运算符的基本运算,假设整数变量A的值为60和变量B的值为13：
         *
         * 操作符	描述	例子
         * ＆	如果相对应位都是1，则结果为1，否则为0	（A＆B），得到12，即0000 1100
         * |	如果相对应位都是0，则结果为0，否则为1	（A | B）得到61，即 0011 1101
         * ^	如果相对应位值相同，则结果为0，否则为1	（A ^ B）得到49，即 0011 0001
         * 〜	按位取反运算符翻转操作数的每一位，即0变成1，1变成0。	（〜A）得到-61，即1100 0011
         * << 	按位左移运算符。左操作数按位左移右操作数指定的位数。	A << 2得到240，即 1111 0000
         * >> 	按位右移运算符。左操作数按位右移右操作数指定的位数。	A >> 2得到15即 1111
         * >>> 	按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。	A>>>2得到15即0000 1111
         */
        System.out.println();
        System.out.println("位运算");
        int a4 = 60; /* 60 = 0011 1100 */
        int b4 = 13; /* 13 = 0000 1101 */
        int c4 = 0;
        c4 = a4 & b4;       /* 12 = 0000 1100 */
        System.out.println("a4 & b4 = " + c4);

        c4 = a4 | b4;       /* 61 = 0011 1101 */
        System.out.println("a4 | b4 = " + c4);

        c4 = a4 ^ b4;       /* 49 = 0011 0001 */
        System.out.println("a4 ^ b4 = " + c4);

        c4 = ~a4;          /*-61 = 1100 0011 */
        System.out.println("~a4 = " + c4);

        c4 = a4 << 2;     /* 240 = 1111 0000 */
        System.out.println("a4 << 2 = " + c4);

        c4 = a4 >> 2;     /* 15 = 1111 */
        System.out.println("a4 >> 2  = " + c4);

        c4 = a4 >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a4 >>> 2 = " + c4);


        // 逻辑运算符
        /**
         * 下表列出了逻辑运算符的基本运算，假设布尔变量A为真，变量B为假
         *
         * 操作符	描述	例子
         * &&	称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。	（A && B）为假。
         * | |	称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。	（A | | B）为真。
         * ！	称为逻辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。	！（A && B）为真。
         */
        System.out.println();
        System.out.println("逻辑运算符");
        boolean a5 = true;
        boolean b5 = false;
        System.out.println("a5 && b5 = " + (a5 && b5));
        System.out.println("a5 || b5 = " + (a5 || b5));
        System.out.println("!(a5 && b5) = " + !(a5 && b5));

        // 赋值运算符
        /**
         *
         操作符	描述	例子
         =	简单的赋值运算符，将右操作数的值赋给左侧操作数	C = A + B将把A + B得到的值赋给C
         + =	加和赋值操作符，它把左操作数和右操作数相加赋值给左操作数	C + = A等价于C = C + A
         - =	减和赋值操作符，它把左操作数和右操作数相减赋值给左操作数	C - = A等价于C = C -
         A
         * =	乘和赋值操作符，它把左操作数和右操作数相乘赋值给左操作数	C * = A等价于C = C * A
         / =	除和赋值操作符，它把左操作数和右操作数相除赋值给左操作数	C / = A等价于C = C / A
         （％）=	取模和赋值操作符，它把左操作数和右操作数取模后赋值给左操作数	C％= A等价于C = C％A
         << =	左移位赋值运算符	C << = 2等价于C = C << 2
         >> =	右移位赋值运算符	C >> = 2等价于C = C >> 2
         ＆=	按位与赋值运算符	C＆= 2等价于C = C＆2
         ^ =	按位异或赋值操作符	C ^ = 2等价于C = C ^ 2
         | =	按位或赋值操作符	C | = 2等价于C = C | 2
         */
        System.out.println();
        System.out.println("赋值运算符");
        Operation.setVal();

    }

    public static void setVal() {
        int a = 10;
        int b = 20;
        int c = 0;
        c = a + b;
        System.out.println("c = a + b = " + c);
        c += a;
        System.out.println("c += a  = " + c);
        c -= a;
        System.out.println("c -= a = " + c);
        c *= a;
        System.out.println("c *= a = " + c);
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a  = " + c);
        c <<= 2;
        System.out.println("c <<= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        c &= a;
        System.out.println("c &= a  = " + c);
        c ^= a;
        System.out.println("c ^= a   = " + c);
        c |= a;
        System.out.println("c |= a   = " + c);
    }
}
