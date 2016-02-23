package org.m41highway;

import java.util.concurrent.CountDownLatch;

public class MessageReceiver {
    //private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        //latch.countDown();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
    public CountDownLatch getLatch() {
        return latch;
    }*/
}

