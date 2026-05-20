package com.livein;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
@Component
public class Aliean {

    @Value("23")
    int age;
//    @Autowired
//            @Qualifier("desktop")
    Computer com;
    public Aliean(){
        System.out.println("Aliean object created");
    }
////    @ConstructorProperties({"age","lap"})
//    Aliean(int age,Laptop lap){
//        this.age=age;
//        this.lap=lap;
//    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }
    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("coding");
        com.compile();
    }
}
