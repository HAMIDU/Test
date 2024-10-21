package main.java;

public class BoxTwo extends Box {
    private int width;
    private int height;

    BoxTwo(int width, int height){
        super.height=height;
        super.width=width;
    }
    void setHeight(int h){
        this.height=h;

    }
    void setWeight (int w){
        this.width = w;
    }
    int getWidth(){
        return this.width;
    }
    int getHeight(){
        return this.height;
    }
}
