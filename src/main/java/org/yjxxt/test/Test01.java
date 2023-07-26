package org.yjxxt.test;

import org.yjxxt.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    public static void main (String[] args){
        //获取spring上下文环境
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        //通过id属性值得到指定的bean对象
        UserService userService= (UserService) ac.getBean("userService");
        //调用实例化好的javabean对象
        userService.test();
    }
}
