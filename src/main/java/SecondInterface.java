package main.java;

public interface SecondInterface {
    void methodTest();

    default String methodTestTwo() {
        return "Hamid";
    }


}
