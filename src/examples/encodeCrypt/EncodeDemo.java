package examples.encodeCrypt;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

/**
 * @Author：running@aweb.cc
 * @Date：2021/9/8 4:02 下午
 */
public class EncodeDemo {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        urlTest();
        base64Test();
        base64ByUrlDecoder();
        hashMd5();
        hashSha();
    }

    static void hashMd5() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        // 创建一个MessageDigest实例:
        MessageDigest md = MessageDigest.getInstance("MD5");
        // 反复调用update输入数据:
        md.update("Hello".getBytes("UTF-8"));
        md.update("World".getBytes("UTF-8"));
        // 16 bytes: 68e109f0f40ca72a15e05cc22786f8e6
        byte[] result = md.digest();
        System.out.println(new BigInteger(1, result).toString(16));
        System.out.println(new BigInteger(1, result).toString(32));
        System.out.println(new BigInteger(1, result).toString(64));
    }

    static void hashSha() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        // 创建一个MessageDigest实例:
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        // 反复调用update输入数据:
        md.update("Hello".getBytes("UTF-8"));
        md.update("World".getBytes("UTF-8"));
        byte[] result = md.digest();
        // 20 bytes: db8ac1c259eb89d4a131b253bacfca5f319d54f2
        System.out.println(new BigInteger(1, result).toString(16));
        System.out.println(new BigInteger(1, result).toString(32));
        System.out.println(new BigInteger(1, result).toString(64));
    }

    static void urlTest() {
        String encoded = URLEncoder.encode("中文!", StandardCharsets.UTF_8);
        System.out.println(encoded);

        String decoded = URLDecoder.decode(encoded, StandardCharsets.UTF_8);
        System.out.println(decoded);
    }

    static void base64Test() {
        byte[] input = new byte[]{(byte) 0xe4, (byte) 0xb8, (byte) 0xad};
        String b64encoded = Base64.getEncoder().encodeToString(input);
        System.out.println(b64encoded);

        byte[] output = Base64.getDecoder().decode("5Lit");
        // [-28, -72, -83]
        System.out.println(Arrays.toString(output));
    }

    static void base64ByUrlDecoder()
    {
        byte[] input = new byte[] { 0x01, 0x02, 0x7f, 0x00 };
        String b64encoded = Base64.getUrlEncoder().encodeToString(input);
        System.out.println(b64encoded);

        byte[] output = Base64.getUrlDecoder().decode(b64encoded);
        System.out.println(Arrays.toString(output));
    }
}
