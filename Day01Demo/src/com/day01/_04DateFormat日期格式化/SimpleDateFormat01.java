package com.itheima._04DateFormat日期格式化;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
* DateFormat:
*    日期格式化类，可以格式化时间，可以解析字符串时间。
*    DateFormat是一个抽象类，抽象类不能直接使用。
*
*    DateFormat的实现类： SimpleDateFormat
*
* SimpleDateFormat(简单日期格式化)的常用功能：
*    (1)格式化时间。
*       格式化Date日期对象时间 ： format(Date d)
*       格式化时间毫秒值 : format(long time)
*
*    (2)解析字符串的时间。
*
*/
public class SimpleDateFormat01 {
    public static void main(String[] args){
        // 创建一个SimpleDateFormat
        // 参数：其实就是一个时间模板。就是格式化后的时间形式。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE");
        // 得到系统当前此刻日期对象
        Date d = new Date();

        // 把 d 格式化
        String rs = sdf.format(d);
        System.out.println(rs);

        // ---------------------------------------
        // 得到一个毫秒值 123s 后的时间
        long time = d.getTime();
        time+= 123 * 1000 ;
        System.out.println(sdf.format(time));

    }
}