package main.java;

public class ThreadClass implements Runnable {
    public static void main(String[] args) {
        Thread a = new Thread("ONE");
        a.start();
        System.out.println(a.isAlive());
        try {
            a.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        System.out.println("FIRST");
    }
}
