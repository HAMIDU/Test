package main.java;

public abstract class Abstract {
    void printMessage(){
        System.out.println("ABSTRACT");
    }
    int a;
    protected abstract void printText();

    Abstract (){
        System.out.println("Abstraction");
    }
}
