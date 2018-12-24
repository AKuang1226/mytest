package com.itheima._05Calendar日历类的详细使用;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
* 日历类：
*   Calendar: 日历类
*   代表的当前此刻时间对应的日历。
*   日历类是抽象的。
*
*   方法：
*   int get(int field); 根据指定的日历字段获得对应的值
*   void set(int field,int value); 修改指定日历字段的值为指定值
*
*/
public class CarlendarDemo01 {
    public static void main(String[] args){
        // 通过调用日历类的静态方法去得到系统此刻时间对应的日历。
        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow);

        // 获取当前此刻日期对象
        Date d = rightNow.getTime();
        System.out.println(d);

        // 获取年
        int year = rightNow.get(Calendar.YEAR);
        System.out.println(year);

        // 获取月
        int mm = rightNow.get(Calendar.MONTH)+1;
        System.out.println(mm);

        int dd = rightNow.get(Calendar.DATE);
        System.out.println(dd);

        // 获取今天是一年中的第几天
        int days = rightNow.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);

        // -------------------------------------
        // 前三天的时间
        /*days -= 3 ;
        // 让日历往前走三天
        // 参数一：一年中的第几天
        // 参数二：修改到这一天
        rightNow.set(Calendar.DAY_OF_YEAR , days);
        System.out.println(rightNow.get(Calendar.DATE)) ;*/
        // -------------------------------------------

        // 得到当前时间的毫秒值
       long time =  rightNow.getTimeInMillis();
       System.out.println(time);

        //格式化输出当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(time));

        // 获取一周中的第几天
       // int wk = rightNow.get(Calendar.DAY_OF_WEEK);
       // System.out.println(wk);


    }
}
