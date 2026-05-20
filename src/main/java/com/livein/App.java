package com.livein;

import com.livein.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);

        Aliean a1=(Aliean)context.getBean("aliean");
        System.out.println(a1.getAge());
        a1.code();
//        Desktop desktop=context.getBean(Desktop.class);
//        desktop.compile();
//
//        Desktop desktop1=context.getBean(Desktop.class);
//        desktop1.compile();
//        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        Aliean a1=context.getBean("aliean",Desktop.class);
//        a1.code();
//        Computer c1=context.getBean("computer",Computer.class);
    }
}
