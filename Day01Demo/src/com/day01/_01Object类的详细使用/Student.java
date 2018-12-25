package com.itheima._01Object类的详细使用;

import java.util.Objects;


public class Student {
    private String name ;
    private int age ;
    private char sex ;

    // 重写继承自Object类的toString()方法
   /* @Override
    public String toString(){
        return "name="+name+",age="+age+",sex="+sex;
    }*/

   // 建议大家自动生成的
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    // swk.equals(swk1)
    // swk == this
    // swk1 ==  o
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 同一个对象的排除！
        // 判断两个比较的对象类型是否一样！
        if (o == null || getClass() != o.getClass()) return false;
        // 开始比较规则，
        Student student = (Student) o;
        return age == student.age &&
                sex == student.sex &&
                Objects.equals(name, student.name);
    }


/*
    // 重写equals自己来定义比较规则。
    // 只要学生的名字，年龄，性别一样就认为是同一个对象。
    // swk.equals(swk1)
    // 比较者： swk -> this
    // 被比较者 ： swk1 -> obj
    @Override
    public boolean equals(Object obj) {
        // 1.obj对象必须是学生类型
       // instanceof : 前面变量必须是后面类型或者后面类型的子类对象。
        if(obj instanceof Student){
            // obj一定是学生的对象
            // 把obj转成学生对象
            Student swk1 = (Student) obj;
            // 只要学生的名字，年龄，性别一样就认为是同一个对象。
            if(this.name.equals(swk1.name) && this.age == swk1.age
                  && this.sex == swk1.sex){
                return true ;
            }else{
                return false;
            }
        }else{
            // 不是学生对象 返回false
            return false;
        }
    }
*/
    public Student() {

    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
