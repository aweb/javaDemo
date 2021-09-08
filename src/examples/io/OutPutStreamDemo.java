package examples.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * 和InputStream相反，OutputStream是Java标准库提供的最基本的输出流。
 * 和InputStream类似，OutputStream也是抽象类，它是所有输出流的超类。这个抽象类定义的一个最重要的方法就是void write(int b)，签名如下：
 * public abstract void write(int b) throws IOException;
 */
public class OutPutStreamDemo {

    public static void main(String[] args) throws IOException {
        writeFile();
    }

    static void writeFile() throws IOException {
        String fileName  = "./src/source/test2.txt";
        OutputStream output = new FileOutputStream(fileName);
        output.write(72); // H
        output.write(101); // e
        output.write(108); // l
        output.write(108); // l
        output.write(111); // o
        output.close();

        // get context
        InputStreamDemo.readFile(fileName);

        try (OutputStream output2 = new FileOutputStream(fileName)) {
            output2.write("HELLO WORLD\n".getBytes(StandardCharsets.UTF_8));
            output2.write("Running".getBytes(StandardCharsets.UTF_8));
        } // 编译器在此自动为我们写入finally并调用close()

        // get context
        InputStreamDemo.readFile(fileName);
    }
}
