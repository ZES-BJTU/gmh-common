package com.zes.squad.gmh.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EncryptUtils {

    private static final String ENCRYPT_WAY_MD5     = "MD5";
    private static final String ENCRYPT_WAY_SHA1    = "SHA1";
    private static final int    DEFAULT_BUFFER_SIEZ = 1024 * 10 * 10 * 10;

    private static final char[] hexDigits           = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C',
            'D', 'E', 'F' };

    private EncryptUtils() {

    }

    /**
     * 字符串MD5加密
     * 
     * @param text
     * @return
     */
    public static String MD5(String text) {
        return encryptString(text, EncryptUtils.ENCRYPT_WAY_MD5);
    }

    /**
     * 字符串SHA1加密
     * 
     * @param text
     * @return
     */
    public static String SHA1(String text) {
        return encryptString(text, EncryptUtils.ENCRYPT_WAY_SHA1);
    }

    /**
     * 字符串通用加密
     * 
     * @param text
     * @param algorithm
     * @return
     */
    public static String encryptString(String text, String algorithm) {
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance(algorithm);
            byte[] bytes = digest.digest(text.getBytes(Charset.forName("utf-8")));
            String result = byteArrayToString(bytes);
            return result;
        } catch (NoSuchAlgorithmException e) {
            EncryptUtils.log.error("字符串加密出错, param is {}, algorithm is {}", text, algorithm, e);
        }
        return null;
    }

    /**
     * 文件MD5摘要计算
     * 
     * @param fis
     * @return
     */
    public static String MD5(InputStream fis) {
        return encryptFile(fis, EncryptUtils.ENCRYPT_WAY_MD5);
    }

    /**
     * 文件SHA1摘要计算
     * 
     * @param fis
     * @return
     */
    public static String SHA1(InputStream fis) {
        return encryptFile(fis, EncryptUtils.ENCRYPT_WAY_SHA1);
    }

    /**
     * 文件通用摘要计算
     * 
     * @param fis
     * @param algorithm
     * @return
     */
    public static String encryptFile(InputStream fis, String algorithm) {
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance(algorithm);
            int length = -1;
            byte[] b = new byte[EncryptUtils.DEFAULT_BUFFER_SIEZ];
            while ((length = fis.read(b)) != -1) {
                digest.update(b, 0, length);
            }
            byte[] bytes = digest.digest();
            String result = byteArrayToString(bytes);
            return result;
        } catch (NoSuchAlgorithmException e) {
            EncryptUtils.log.error("文件计算加密摘要出错, file is {}, algorithm is {}", "", algorithm, e);
        } catch (IOException e) {
            EncryptUtils.log.error("文件流读取出错", e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                EncryptUtils.log.error("文件流关闭出错", e);
            }
        }
        return null;
    }

    /**
     * 字节数组转化为String
     * 
     * @param bytes
     * @return
     */
    public static String byteArrayToString(byte[] bytes) {
        char[] cs = new char[bytes.length * 2];
        int i = 0;
        for (byte b : bytes) {
            cs[i++] = hexDigits[(b >>> 4) & 0xf];
            cs[i++] = hexDigits[b & 0xf];
        }
        return new String(cs);
    }

}
