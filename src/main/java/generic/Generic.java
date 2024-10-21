package main.java.generic;

public class Generic<T> {
    T obj;
    void setObj(T obj){
        this.obj=obj;
    }
    T getObj(){
        return this.obj;
    }
}
