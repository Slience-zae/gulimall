package com.atguigu.common.utils;

import java.util.HashMap;
import java.util.Map;
import cn.hutool.http.HttpUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * 河南省某行政区重名人数查询
 */
public class CheckNamesUtils {
    public static void main(String[] args) {
        queryRepeatNameNumber("410100","汪苏泷");
    }

    /**
     * 方法描述: 查询行政区（）划下，同名人数
     *
     * @param area 河南省行政地区划分码
     * @param name 姓名
     * @Return {@link String}
     * @throws
     * @author tarzan Liu
     * @date 2020年08月10日 11:54:53
     */
    public  static  String  queryRepeatNameNumber(String area,String name){
        String address="http://bsdt.henanga.gov.cn/MainPages/ChaXunZhongXin/SameNameQuery";
        Map<String, Object> paramsMap = new HashMap<>();
        paramsMap.put("form_areaid", area);
        paramsMap.put("form_Name", name);
        String body=HttpUtil.createPost(address).form(paramsMap).execute().body();
        Document doc= Jsoup.parse(body);
        String num= doc.select("p[class=text01]").text();
        System.out.println("行政区划为"+area+" 姓名为"+name+" 共有"+num+"人");
        return num;
    }
}
