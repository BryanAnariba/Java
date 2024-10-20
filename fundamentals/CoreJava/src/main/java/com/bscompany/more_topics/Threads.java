package com.bscompany.more_topics;

class Z extends Thread {
    
}

class A extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("A says hi!");

        }
    }
}

class B extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("B says hi!");

        }
    }
}

public class Threads {

    public static void main(String[] args) {
        A at = new A();
        B bt = new B();

        // Se ejecutan en paralelo, a la misma vez: 11:00:00
        at.setPriority(Thread.MAX_PRIORITY);
        bt.setPriority(Thread.MAX_PRIORITY);
        System.out.println(at.getPriority() + "::" + bt.getPriority());
        at.start();
        bt.start();
    }

}
