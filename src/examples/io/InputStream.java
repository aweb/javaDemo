package examples.io;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * InputStream就是Java标准库提供的最基本的输入流。它位于java.io这个包里。java.io包提供了所有同步IO的功能。
 */
class InputStreamDemo {

    public static void main(String[] args) throws IOException {
        // readFile
        readFile("./src/source/test1.txt");
        // ByteArrayInputStream
        byteArrayInputStream();
    }

    /**
     * 对这个String readAsString(InputStream input)方法进行测试就相当简单，因为不一定要传入一个真的FileInputStream：
     * 这就是面向抽象编程原则的应用：接受InputStream抽象类型，而不是具体的FileInputStream类型，从而使得代码可以处理InputStream的任意实现类。
     *
     * @throws IOException
     */
    static void readFile(String fileName) throws IOException {
        String s;
        try (InputStream input = new FileInputStream(fileName)) {
            s = readAsString(input);
        }
        System.out.println(s);
    }

    /**
     * ByteArrayInputStream
     */
    static void byteArrayInputStream() {
        byte[] data = {72, 101, 108, 108, 111, 33};
        try (InputStream input = new ByteArrayInputStream(data)) {
            System.out.println("start get ByteArrayInputStream");
            String s = readAsString(input);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取字符串
     *
     * @param input
     * @return
     * @throws IOException
     */
    public static String readAsString(InputStream input) throws IOException {
        int n;
        StringBuilder sb = new StringBuilder();
        while ((n = input.read()) != -1) {
            sb.append((char) n);
        }
        return sb.toString();
    }
}
