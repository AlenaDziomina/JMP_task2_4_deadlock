package com.grouk;

public class Main extends Thread{

    public static void main(String args[]) {
        final Object resource = "resource";

        for (int i = 0; i < 5; i++) {
            final int n = i;
            Thread t = new Thread() {
                public void run() {

                    synchronized (resource) {
                        System.out.println("Thread " + n + ": locked resource");
                        try {
                            Thread.sleep(100000);
                        } catch (InterruptedException e) {
                        }
                    }
                }
            };
            t.start();
        }
    }
}
