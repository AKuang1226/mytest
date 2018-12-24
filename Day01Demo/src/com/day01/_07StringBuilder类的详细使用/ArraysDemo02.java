package com.itheima._07StringBuilder类的详细使用;
/*
* 数组默认打印地址
* 需求： 写一个方法输出数组的数据。
*      [1,2,3,4,5]
*
* */
public class ArraysDemo02 {
    public static void main(String[] args){
        int[] ints = new int[]{1,2,3,4,5};
        System.out.println(toStr(ints));
    }

    public static String toStr(int[] arrs){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0 ; i < arrs.length ; i++ ) {
            int ele = arrs[i];
            /*if(i ==  arrs.length -1){
                sb.append(ele);
            }else{
                sb.append(ele).append(",");
            }*/
            sb.append(i==arrs.length-1?ele:ele+",");
        }
        sb.append("]");

        String rs = sb.toString();
        return rs;
    }
}
