package com.itheima._03Date日期类的详细使用;

import java.util.Date;

/*
* Date类：
*     代表的是系统当前此刻日期对象。
*
* 创建日期对象：
*    构造器：
*      （1）Date()
*      （2）Date(long time)
*
*    时间的记录形式：Date日期，时间毫秒值(long值)
*
*
* */
public class DateDemo01 {
    public static void main(String[] args){
        // 创建一个日期对象，代表了系统当前此刻日期对象
        Date d = new Date();
        // 输出的是一个美式时间
        System.out.println(d);

        // 返回时间的毫秒值：从1970年1月1日到此刻走过的总的时间毫秒值
        // 1s = 1000ms的。
        // Date --> long
        long timer = d.getTime();
        System.out.println(timer);
    }
}
