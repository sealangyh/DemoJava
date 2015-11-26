package com.demo;

public class SimpleThread extends Thread {

    private int index = 30;
    
    public void run() {
        System.out.println("I'm running from simple thread!");
        System.out.println(String.format("Hi, ID=%s, Name=%s", this.getId(), this.getName()));
        for(;index > 0; ){
            System.out.println(String.format("ID=%s, Name=%s, index=%s", this.getId(), this.getName(), index--));
        }
    }

}
