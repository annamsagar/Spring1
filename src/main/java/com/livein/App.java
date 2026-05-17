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
        Aliean a1=context.getBean("aliean",Aliean.class);
        a1.code();
        Computer c1=context.getBean("computer",Computer.class);
    }
}
