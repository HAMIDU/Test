package main.java;

import main.java.two.Two;

public class PackageTest implements FirstInterface {
    public static void main(String[] args) {
        Two two = new Two();
        two.d2=4;

        PackageTest packageTest = new PackageTest();
        System.out.println(packageTest.methodTestTwo());


    }

    @Override
    public void methodTest() {
        System.out.println("methodTest");
    }

    @Override
     public String methodTestTwo() {
        return "Yousefi";
     }
}
