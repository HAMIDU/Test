package main.java;

import java.io.IOException;

public class Exception {
    public static void main(String[] args) {
        try {
            methodExc();
        } catch (ExceptionSpecefic e) {
            System.out.println(e.getMessage());
        }

    }
    static void methodExc() throws ExceptionSpecefic {
        System.out.println("EXCEPTIOOOON");
         throw new ExceptionSpecefic();
    }
}
