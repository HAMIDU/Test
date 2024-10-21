package main.java.three;

public class MyClassTwo extends MyClass {
    @Override
    MyClassTwo get() {
        return this;
    }

    void message() {
        System.out.println("welcome to covariant return type");
    }

    public static void main(String args[]) {
        new MyClassTwo().get().message();
    }
}
