package com.jiang.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test03 {
    @MyAnnotation2(name="大江哥")
    public void sayHi(){

    }
    @MyAnnotation3("哈哈哈")
    public void goHome(){

    }
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    //注解的参数：参数 + 参数名();
    String name() default "";
    int age() default 0;
    int id() default -1; //默认值为-1，代表不存在
    String[] schools() default {"湖北警官学院","公安县第三中学"};
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{

    String value();  //注解只有一个value时，可以直接写值，不用写value=""
}

