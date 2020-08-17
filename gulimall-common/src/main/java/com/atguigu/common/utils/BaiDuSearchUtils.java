package com.atguigu.common.utils;


import java.net.*;
import java.io.*;

/**
 * 百度查询接口工具类
 */
public class BaiDuSearchUtils {
    private static final String CHARACTER = "gb2312";
    private static final String BAIDU_URL = "http://www.baidu.com.cn/s?wd=";
    public BaiDuSearchUtils() {
    }

    public static void main(String[] args) {
        baiDuSearch("汪苏泷");
    }

    /**
     * 查询关键字
     * @param keyName
     */
    public static void baiDuSearch(String keyName){
        try {
            String key = URLEncoder.encode(keyName,CHARACTER);
            URL url = new URL(BAIDU_URL+key+"&cl=3");
            URLConnection connection = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    connection.getInputStream(),CHARACTER));
            String str = reader.readLine();
            while (str != null){
                System.out.println(str);
                str = reader.readLine();
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
