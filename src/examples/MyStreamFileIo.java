package examples;

import java.io.*;

/**
 * Java 流(Stream)、文件(File)和IO
 * <p>
 * Java.io 包几乎包含了所有操作输入、输出需要的类。所有这些流类代表了输入源和输出目标。
 * Java.io 包中的流支持很多种格式，比如：基本类型、对象、本地化字符集等等。
 * 一个流可以理解为一个数据的序列。输入流表示从一个源读取数据，输出流表示向一个目标写数据。
 * Java 为 I/O 提供了强大的而灵活的支持，使其更广泛地应用到文件传输和网络编程中。
 * 但本节讲述最基本的和流与 I/O 相关的功能。我们将通过一个个例子来学习这些功能。
 */
public class MyStreamFileIo {
    public static void main(String args[]) throws IOException {
        // 控制台输出
        int b = 'A';
        System.out.write(b);
        System.out.write('\n');
        System.out.println(b);

        /**
         * FileInputStream
         *
         * 该流用于从文件读取数据，它的对象可以用关键字 new 来创建。
         * 有多种构造方法可用来创建对象。
         * 可以使用字符串类型的文件名来创建一个输入流对象来读取文件：
         */
        File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f);
        // 构建FileOutputStream对象,文件不存在会自动新建
        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
        writer.append("中文输入");
        // 写入到缓冲区
        writer.append("\r\n");
        // 换行
        writer.append("English");
        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入
        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
        fop.close();
        // 关闭输出流,释放系统资源
        FileInputStream fip = new FileInputStream(f);
        // 构建FileInputStream对象
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        // 构建InputStreamReader对象,编码与写入相同
        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
            // 转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        reader.close();
        // 关闭读取流
        fip.close();
        // 关闭输入流,释放系统资源

        // 创建目录
        String dirname = "/tmp/java";
        File d = new File(dirname);
        // 现在创建目录
        d.mkdirs();

        /**
         * 读取目录
         *
         * 一个目录其实就是一个 File 对象，它包含其他文件和文件夹。
         * 如果创建一个 File 对象并且它是一个目录，那么调用 isDirectory() 方法会返回 true。
         * 可以通过调用该对象上的 list() 方法，来提取它包含的文件和文件夹的列表。
         * 下面展示的例子说明如何使用 list() 方法来检查一个文件夹中包含的内容：
         */
        String dirname2 = "/tmp";
        File f1 = new File(dirname2);
        if (f1.isDirectory()) {
            System.out.println("目录 " + dirname2);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f2 = new File(dirname2 + "/" + s[i]);
                if (f2.isDirectory()) {
                    System.out.println(s[i] + " 是一个目录");
                } else {
                    System.out.println(s[i] + " 是一个文件");
                }
            }
        } else {
            System.out.println(dirname2 + " 不是一个目录");
        }

        /**
         * 删除文件可以使用 java.io.File.delete() 方法。
         *
         * 以下代码会删除目录 /tmp/java/，需要注意的是当删除某一目录时，必须保证该目录下没有其他文件才能正确删除，否则将删除失败。
         */
        // 这里修改为自己的测试目录
        File folder = new File("/tmp/java/");
        deleteFolder(folder);


        //使用 BufferedReader 在控制台读取字符
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        String str;
        // 读取字符
        do {
            str = br.readLine();
            System.out.println("Hi," + str);
        } while (!str.equals("q"));
    }

    // 删除文件及目录
    public static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }
}
