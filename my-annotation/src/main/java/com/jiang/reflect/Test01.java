package com.jiang.reflect;

public class Test01 {
    public static void main(String args[]){
        //通过反射获取类的对象
        try {
            Class c1 = Class.forName("com.jiang.reflect.User");
            System.out.println(c1);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

class User{
    private String name;

    private int age;
}
