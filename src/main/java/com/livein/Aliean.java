package com.livein;

import java.beans.ConstructorProperties;

public class Aliean {

    int age;
    Laptop lap;
    Aliean(){
        System.out.println("Aliean object created");
    }
//    @ConstructorProperties({"age","lap"})
    Aliean(int age,Laptop lap){
        this.age=age;
        this.lap=lap;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        System.out.println("coding");
        lap.compile();
    }
}
