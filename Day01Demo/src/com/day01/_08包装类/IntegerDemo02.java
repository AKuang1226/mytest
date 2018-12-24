package com.itheima._08包装类;
/*
* 包装类的特有功能：
*     (1)包装类是一个类，所有拥有Object类的全部功能。
*     （2）包装类本身提供了一些很好用的方法：
*         XXX.toString(xxxx); // 把某种类型的数值转成字符串。
*         XXX.parseXXX("字符串数值")
*         XXX.valueOf("字符串数值")
*/
public class IntegerDemo02 {
    public static void main(String[] args){
        Integer it = 12;
        // (1)把数值数据变成字符串
        String rs = it.toString();
        System.out.println(rs);

        // (2)直接给字符加一个空字符串即可（最简单的形式）
        String rs1 = it + "" ;
        System.out.println(rs1);

        // (3) 通过Integer的toString方法转字符串
        String rs2 = Integer.toString(it);
        System.out.println(rs2);
        // ------------------------------------------

        String str = "112";
        // 把字符串数值转成对应的数值类型形式
       //Integer it1 = Integer.parseInt(str);
        Integer it1 = Integer.valueOf(str);
        it1++ ;
        System.out.println(it1);

        String score = "23.32";
      // Double db = Double.parseDouble(score);
        Double db = Double.valueOf(score);
        db+=12.68;
        System.out.println(db);

    }
}
