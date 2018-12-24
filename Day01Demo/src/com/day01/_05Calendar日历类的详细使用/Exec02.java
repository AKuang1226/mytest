package com.itheima._05Calendar日历类的详细使用;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 请使用日期时间相关的API，计算出一个人已经出生了多少天:
* 第一步告诉我你的生日：1994 10 09
* */
public class Exec02 {
    public static void main(String[] args) throws ParseException {
        // 定义生日
        String birth = "1997/04/23";
        // 转成日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        Date d = sdf.parse(birth);
        // 出生的时间毫秒值
        long time = d.getTime() ;

        // 计算出他走过的总的时间毫秒值
        long cTime = new Date().getTime();
        // 活过的总的时间毫秒值
        long tTime = cTime - time ;

        // 计算成天
        System.out.println(tTime*1.0/(24*60*60*1000)+"天");

    }
}
