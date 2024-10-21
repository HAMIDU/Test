package main.java.generic;

public class TestGenerics3 {
    public static void main(String args[]) {
        Generic<String> integerGeneric=new Generic<>();
        integerGeneric.setObj("1366");
        System.out.println(integerGeneric.getObj());
    }
}