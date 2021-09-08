package examples.io;

import java.io.File;
import java.io.IOException;

/**
 * IO File
 */
public class FileDemo {
    static String flag = "|--";

    public static void main(String[] args) throws IOException {
        System.out.println("##############file path");
        File f = new File("..");
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getCanonicalPath());

        File f1 = new File("./src/source/test-dir");
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getCanonicalPath());
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());

        System.out.println("##############for files");
        forFiles("./src/source");
    }

    static void forFiles(String path) {
        File f = new File(path);
        // 列出所有文件和子目录
        File[] fs1 = f.listFiles();
        printFiles(fs1);
        // 仅列出.exe文件
//        File[] fs2 = f.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                // 返回true表示接受该文件
//                return name.endsWith(".txt");
//            }
//        });
//        printFiles(fs2);
    }

    static void printFiles(File[] files) {
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println(flag + f.toString());
                    flag += "--";
                    forFiles(f.getPath());
                } else {
                    System.out.println(flag + f.toString());
                }
            }
        }
    }
}
