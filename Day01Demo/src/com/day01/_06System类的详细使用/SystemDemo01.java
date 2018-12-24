package com.itheima._06System类的详细使用;

import java.text.SimpleDateFormat;
import java.util.Arrays;

/*
* System类的常用方法：
*    -- currentTimeMillis() 获取时间此刻时间毫秒值
*    -- public static void
*       arraycopy(Object src, int srcPos,Object dest, int destPos, int length)：
         数组复制
         src：源数组 要复制的数组
         srcPos：源数组的起始索引
         dest：目标数组
         destPos：目标数组的起始索引
         length：要复制的元素个数

*
* */
public class SystemDemo01 {
    public static void main(String[] args){
        // 得到系统时间毫秒值
        long time = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm EEE");
        System.out.println(sdf.format(time));

        // 0说明是正常退出，干掉JVM虚拟机，程序立即结束
        //System.exit(0);

        // 数组复制（掌握）
        int[] arrs = new int[]{60,70,80,90,100};
        int[] arrs1 = new int[8]; // [0 , 0 , 70 , 80 , 90 , 0 , 0 , 0]
        /*
        * 参数一：被复制的数组
        * 参数二：从哪个位置开始复制（索引位置）
        * 参数三：复制到哪个数组
        * 参数四：从目标数组的哪个位置开始粘贴
        * 参数无： 要复制的元素个数
        * */
        System.arraycopy(arrs,1,arrs1,2,3);
        System.out.println(Arrays.toString(arrs1));

        //arrs = null ;
        //System.gc();通过垃圾回收器回收垃圾


        // 获取当前系统的全部属性信息
        System.out.println(System.getProperties());
        // 获取系统的某个属性的信息
        System.out.println(System.getProperty("os.name"));



    }
}
