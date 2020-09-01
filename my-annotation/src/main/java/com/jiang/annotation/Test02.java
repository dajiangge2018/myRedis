package com.jiang.annotation;

import java.lang.annotation.*;

/**
 * 元注解
 */
public class Test02 {
    @MyAnnotation
    public void sayHi(){

    }
}

//定义一个注解
/**
 * ElementType.METHOD 方法上的
 * ElementType.TYPE 类上的
 */
@Target(value= {ElementType.METHOD,ElementType.TYPE})
//Retention  runtime > class >sources
@Retention(value = RetentionPolicy.RUNTIME)
//Documented 表示是否将我们的注解生成在javadoc中
@Documented
//说明子类可以继承父类中的注解
@Inherited
@interface MyAnnotation{

}
