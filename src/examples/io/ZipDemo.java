package examples.io;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @Author：running@aweb.cc
 * @Date：2021/9/8 10:16 上午
 */
public class ZipDemo {

    public static ZipOutputStream zipOut;

    public static void main(String[] args) throws IOException {
        String fileName = "./src/source/test-dir/test-dir-file1.txt";
        String zipFileName = "./src/source/test-dir/test-dir-file1.zip";
        zipOutput(fileName, zipFileName);

        String fileName2 = "./src/source";
        String zipFileName2 = "./src/source/test1.zip";
        zipOutput(fileName2, zipFileName2);
        // TODO 文件未完全打包到压缩文件
    }

    /**
     * 压缩文件
     *
     * @param fileName
     * @param zipFileName
     * @throws IOException
     */
    static void zipOutput(String fileName, String zipFileName) throws IOException {
        File file = new File(fileName);
        File zipFile = new File(zipFileName);
        InputStream input = null;
        zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
        zipOut.putNextEntry(new ZipEntry(file.getName()));
        zipOut.setComment("压缩流测试");
        int temp = 0;
        if (file.isDirectory()) {
            listFiles(file, input);
        } else {
            input = new FileInputStream(file);
            while ((temp = input.read()) != -1) {
                zipOut.write(temp);
            }
            input.close();
        }

        zipOut.close();
    }

    /**
     * @param file
     * @param input
     * @throws IOException
     */
    static void listFiles(File file, InputStream input) throws IOException {
        int temp = 0;
        File lists[] = file.listFiles();
        for (int i = 0; i < lists.length; i++) {
            if (lists[i].isDirectory()) {
                System.out.println(lists[i] + " is directory");
                listFiles(lists[i], input);
                continue;
            }

            System.out.println(lists[i] + " is file");
            input = new FileInputStream(lists[i]);
            zipOut.putNextEntry(new ZipEntry(file.getName() + File.separator + lists[i].getName()));
            while ((temp = input.read()) != -1) {
                System.out.println("temp" + temp);
                zipOut.write(temp);
            }
            input.close();
        }
    }

}
