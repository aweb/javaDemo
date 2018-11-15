package examples;

/**
 * Character 类用于对单个字符进行操作。
 * <p>
 * Character 类在对象中包装一个基本类型 char 的值
 * <p>
 * Character 方法
 * <p>
 * 序号	方法与描述
 * 1	isLetter() 是否是一个字母
 * 2	isDigit() 是否是一个数字字符
 * 3	isWhitespace() 是否是一个空白字符
 * 4	isUpperCase() 是否是大写字母
 * 5	isLowerCase() 是否是小写字母
 * 6	toUpperCase() 指定字母的大写形式
 * 7	toLowerCase() 指定字母的小写形式
 * 8	toString() 返回字符的字符串形式，字符串的长度仅为1
 */
public class MyCharacter {
    public static void main(String args[]) {
        char ch = 'a';
        System.out.println(ch);

        Character ch1 = ch;//自动封箱
        System.out.println("是否是一个字母:" + ch1.toUpperCase(ch1));
        System.out.println(ch1);

        Character c = new Character('a');

        char c1 = c;//自动解封
        System.out.println(c1);
        //转义
        System.out.println("访问\"菜鸟教程!\" \n");

        // demo
        Character d = new Character('d');
        System.out.printf("是否是一个字母 %s \n", d.isLetter(d));
        System.out.printf("是否是一个数字字符 %s \n", d.isDigit(d));
        System.out.printf("是否是一个空白字符 %s \n", d.isWhitespace(d));
        System.out.printf("是否是大写字母 %s \n", d.isUpperCase(d));
        System.out.printf("是否是小写字母 %s \n", d.isLowerCase(d));
        System.out.printf("指定字母的大写形式 %s \n", d.toUpperCase(d));
        System.out.printf("指定字母的小写形式 %s \n", d.toLowerCase(d));
        System.out.printf("返回字符的字符串形式，字符串的长度仅为1 %s \n", d.toString());

    }
}
