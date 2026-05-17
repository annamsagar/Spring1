package com.livein;

public class Desktop implements Computer {
    Desktop(){{
    System.out.println("Desktop object created");}
    }
    @Override
    public void compile(){
        System.out.println("compile desktop");
    }
}
