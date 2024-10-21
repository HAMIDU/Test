package main.java.three;

import java.util.ArrayList;
import java.util.List;

public class JavaEightFeatures {

    public static void main(String args[]) {
        List<Integer> iterator = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            iterator.add(i);

        }
        iterator.forEach(integer -> System.out.println(integer));

        MyClass myClass=new MyClass();
        myClass.method1("Hamid");
        System.out.println("-----------");
        myClass.method2();
        System.out.println("-----------");
        myClass.log("Yousef");

        Runnable r = () -> System.out.println("My Runnable");

        Interface1 i1 = (s) -> System.out.println(s);

        i1.method1("abc");
    }
}
