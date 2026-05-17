package com.livein;

import java.beans.ConstructorProperties;

public class Aliean {

    int age;
    Computer com;
    Aliean(){
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

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("coding");
        com.compile();
    }
}
