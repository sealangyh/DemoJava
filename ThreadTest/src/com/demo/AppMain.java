package com.demo;

public class AppMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AppMain app = new AppMain();
        
        //app.TestSimpleThread();
        
        app.TestRunnableThread();
        
        //app.TestRunnableThread2();
    }
    
    public void TestSimpleThread() {
        SimpleThread t1 = new SimpleThread();
        SimpleThread t2 = new SimpleThread();
        SimpleThread t3 = new SimpleThread();
        t1.start();
        t2.start();
        t3.start();
    }
    
    public void TestRunnableThread(){
        RunnableThread run = new RunnableThread();
        Thread tt1 = new Thread(run);
        Thread tt2 = new Thread(run);
        Thread tt3 = new Thread(run);
        tt1.start();
        tt2.start();
        tt3.start();
    }
    
    public void TestRunnableThread2(){
        RunnableThread run1 = new RunnableThread();
        RunnableThread run2 = new RunnableThread();
        RunnableThread run3 = new RunnableThread();
        
        Thread tt1 = new Thread(run1);
        Thread tt2 = new Thread(run2);
        Thread tt3 = new Thread(run3);
        
        tt1.start();
        tt2.start();
        tt3.start();
    }

}
