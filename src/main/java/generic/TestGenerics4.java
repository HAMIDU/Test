package main.java.generic;

public class TestGenerics4 {

    public static <E> void printFile(E[] args) {
        for(E e:args){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Integer[] numbers={1,2,3,4};
        String[] chars={"a","b","c","d"};
        printFile(numbers);
        printFile(chars);
    }
}
