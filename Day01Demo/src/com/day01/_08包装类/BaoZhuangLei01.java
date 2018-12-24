package com.itheima._08包装类;
/*
 * 包装类：
 *     依然是一个类。
 *
 *     Java认为一切皆对象。
 *     但是Java有些东西不是对象，比如基本数据类型不是类更加不是对象。
 *     Java为了让一切皆对象统一，所以把基本数据类型全部包装成了类，
 *     这些基本数据类型包装后的类称为包装类。
 *
 *     基本数据类型           包装类
 *     byte                 Byte
 *     short                Short
 *     int                  Integer(特殊的)
 *     long                 Long
 *     char                 Character(特殊的)
 *     float                Float
 *     double               Double
 *     boolean              Boolean
 *
 */
public class BaoZhuangLei01 {
    public static void main(String[] args){
        // 自动装箱：可以自动直接把基本数据类型的数据或者变量转换成包装类的实例。
        int age = 12 ;
        Integer i = age ; // 自动装箱
        Integer i1 = 32;  // 自动装箱

        // 手工装箱（绝对不建议）
        int j = 12 ;
        Integer t = Integer.valueOf(j);

        // 自动拆箱：包装类的实例可以自动的转成基本数据类型的变量。
        Integer i2 = 12;
        int it1 = i2 ; // 自动拆箱

        // 手工拆箱(不建议)
        Integer ig = 111 ;
        int ig1 = ig.intValue();
        int ig2 = ig;
    }
}
