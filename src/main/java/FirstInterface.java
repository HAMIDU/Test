package main.java;

public interface FirstInterface {
    void methodTest();

    default String methodTestTwo() {
        System.out.println(getElement().length);
        return "Hamid";
    }

    private int[] getElement(){
        return new int[]{1, 2, 3};
    }
}
