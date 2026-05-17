package com.livein;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Aliean a1=(Aliean)context.getBean("aliean");
        a1.age=25;
        System.out.println(a1.age);
        Aliean a2=(Aliean)context.getBean("aliean");
        System.out.println(a2.age);
    }
}
