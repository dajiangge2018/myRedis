package com.jiang.reflect;

public class Test02 {

    public static void main(String args[]) throws ClassNotFoundException{
        //通过反射获取类实例
        Person person = new Student();
        //方式一
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());
        //方式二
        Class c2 = Class.forName("com.jiang.reflect.Student");
        System.out.println(c2.hashCode());
        //方式三
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        //获取父类类型
        Class superClass = c1.getSuperclass();
        System.out.println(superClass);
    }


}

class Person{
    public String name;
}

class Student extends Person{
    public Student(String name){
        this.name = name;
    }

    public Student() {
    }
}

class Teacher extends Person{}
