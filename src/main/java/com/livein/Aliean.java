package com.livein;

public class Aliean {

    int age;
    Laptop lap;
    Aliean(){
        System.out.println("Aliean object created");
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
