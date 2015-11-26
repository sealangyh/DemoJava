package com.demo;

public class RunnableThread implements Runnable {

    private int index = 30;
    
    @Override
    public synchronized void run() {
        System.out.println("I'm running from runnable thread!");
        
        for(;index > 0; ){
            try {
                wait(1000);
                //Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(String.format("index=%s", index--));
        }
        
    }

}
