package examples;

/**
 * Java StringBuffer 和 StringBuilder 类
 * <p>
 * 当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
 * 和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
 * StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
 * 由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
 */
public class MyStringBuffer {
    public static void main(String args[]) {
        /**
         * StringBuffer 方法
         * 1	public StringBuffer append(String s) 将指定的字符串追加到此字符序列。
         * 2	public StringBuffer reverse() 将此字符序列用其反转形式取代。
         * 3	public delete(int start, int end) 移除此序列的子字符串中的字符。
         * 4	public insert(int offset, int i) 将 int 参数的字符串表示形式插入此序列中。
         * 5	replace(int start, int end, String str) 使用给定 String 中的字符替换此序列的子字符串中的字符。
         */
        StringBuffer sBuffer = new StringBuffer("this is test: ");
        sBuffer.append("www");
        sBuffer.append(".aweb");
        sBuffer.append(".com");
        System.out.println(sBuffer);
        // delete
        sBuffer.delete(0, 2);
        System.out.println(sBuffer);
        // insert
        sBuffer.insert(0, "BBB");
        System.out.println(sBuffer);
        // replace
        sBuffer.replace(0, 3, "AAA");
        System.out.println(sBuffer);
        // 字符串相关方法 length……
        System.out.println(sBuffer+" <> :length is :" + sBuffer.length());

        // StringBuilder
        StringBuilder sBuilder = new StringBuilder("hello world");
        System.out.println(sBuilder);
    }
}
