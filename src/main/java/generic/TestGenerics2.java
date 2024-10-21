package main.java.generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestGenerics2 {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "vijay");
        map.put(4, "umesh");
        map.put(2, "ankit");

        // lambda
        map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
        map.forEach(
                (k, v) -> {
                    // yes, we can put logic here
                    if (k != null){
                        System.out.println("Key : " + k + ", Value : " + v);
                    }
                }
        );
        ////
        for(Map.Entry<Integer,String> entry : map.entrySet() ){
           System.out.println(entry.getKey() + "-----" + entry.getValue());
       }
//Now  use  Map.Entry  for  Set  and  Iterator  
        Set<Map.Entry<Integer, String>> set = map.entrySet();

        Iterator<Map.Entry<Integer, String>> itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry e = itr.next();//no  need  to  typecast
            System.out.println(e.getKey() + "  " + e.getValue());
        }

    }
}