package com.livein;

public class Laptop implements Computer {
    Laptop(){
        System.out.println("Laptop object created");
    }
    @Override
    public void compile(){
        System.out.println("compile laptop");
    }
}
