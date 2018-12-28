package advanced.doc;

/**
 * javadoc 标签
 * javadoc 工具软件识别以下标签：
 * <p>
 * 标签	描述	示例
 *
 * @author 标识一个类的作者    @author description
 * @exception 标志一个类抛出的异常    @exception exception-name explanation
 * {@inheritDoc}	从直接父类继承的注释	Inherits a comment from the immediate surperclass.
 * {@link}	插入一个到另一个主题的链接	{@link name text}
 * {@linkplain}	插入一个到另一个主题的链接，但是该链接显示纯文本字体	Inserts an in-line link to another topic.
 * @param 说明一个方法的参数    @param parameter-name explanation
 * @return 说明返回值类型    @return explanation
 * @serial 说明一个序列化属性    @serial description
 * @serialData 说明通过writeObject() 和 writeExternal( )方法写的数据	@serialData description
 * @serialField 说明一个ObjectStreamField组件    @serialField name type description
 * @throws 和 @exception标签一样.	The @throws tag has the same meaning as the @exception tag.
 * {@value}	显示常量的值，该常量必须是static属性。	Displays the value of a constant, which must be a static field.
 * @version 指定类的版本    @version info
 * @see 指定一个到另一个主题的链接    @see anchor
 * @since 标记当引入一个特定的变化时    @since release
 * @deprecated 指名一个过期的类或成员    @deprecated description
 * {@docRoot}	指明当前文档根目录的路径	Directory Path
 *
 * 生成doc 文档
 * javadoc SquareNum.java
 */

import java.io.*;

/**
 * 这个类演示了文档注释
 *
 * @author Ayan Amhed
 * @version 1.2
 */
public class SquareNum {
    /**
     * This method returns the square of num.
     * This is a multiline description. You can use
     * as many lines as you like.
     *
     * @param num The value to be squared.
     * @return num squared.
     */
    public double square(double num) {
        return num * num;
    }

    /**
     * This method inputs a number from the user.
     *
     * @return The value input as a double.
     * @throws IOException On input error.
     * @see IOException
     */
    public double getNumber() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader inData = new BufferedReader(isr);
        String str;
        str = inData.readLine();
        return (new Double(str)).doubleValue();
    }

    /**
     * This method demonstrates square().
     *
     * @param args Unused.
     * @return Nothing.
     * @throws IOException On input error.
     * @see IOException
     */
    public static void main(String args[]) throws IOException {
        SquareNum ob = new SquareNum();
        double val;
        System.out.println("Enter value to be squared: ");
        val = ob.getNumber();
        val = ob.square(val);
        System.out.println("Squared value is " + val);
    }
}