package examples.io;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Java的IO标准库提供的InputStream根据来源可以包括：
 * <p>
 * FileInputStream：从文件读取数据，是最终数据源；
 * ServletInputStream：从HTTP请求读取数据，是最终数据源；
 * Socket.getInputStream()：从TCP连接读取数据，是最终数据源；
 * <p>
 * Java的IO标准库使用Filter模式为InputStream和OutputStream增加功能：
 * <p>
 * 可以把一个InputStream和任意个FilterInputStream组合；
 * 可以把一个OutputStream和任意个FilterOutputStream组合。
 * Filter模式可以在运行期动态增加功能（又称Decorator模式）
 */
public class FilterDemo {

    public static void main(String[] args) throws IOException {
        byte[] data = "hello, world!".getBytes(StandardCharsets.UTF_8);
        try (CountInputStream input = new CountInputStream(new ByteArrayInputStream(data))) {
            int n;
            while ((n = input.read()) != -1) {
                System.out.println("n=" + n + " char=" + (char) n);
            }
            System.out.println("Total read " + input.getBytesRead() + " bytes");
        }
    }
}

class CountInputStream extends FilterInputStream {
    private int count = 0;

    CountInputStream(InputStream in) {
        super(in);
    }

    public int getBytesRead() {
        return this.count;
    }

    @Override
    public int read() throws IOException {
        int n = in.read();
        if (n != -1) {
            this.count++;
        }
        return n;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int n = in.read(b, off, len);
        if (n != -1) {
            this.count += n;
        }
        return n;
    }
}
