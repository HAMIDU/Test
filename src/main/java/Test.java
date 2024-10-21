package main.java;

public class Test {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        box2 = box1;
        box1.setHeight(10);
        box1.setWeight(20);

        System.out.println("First output :" + box1.getHeight() * box1.getWidth());
        System.out.println("Second output :" + box2.getHeight() * box2.getWidth());
        box2.setHeight(40);

        System.out.println("First output :" + box1.getHeight() * box1.getWidth());
        System.out.println("Second output :" + box2.getHeight() * box2.getWidth());
/*
        Box boxTwo = new BoxTwo(11, 22);
        boxTwo.setHeight(33);
        System.out.println(boxTwo.getHeight())*/
        ;
        System.out.println(Animal.CAT.makeNoise());
        System.out.println(Animal.DOG);
    }
    public enum Animal {
        CAT {
            public String makeNoise() { return "MEOW!"; }
        },
        DOG {
            public String makeNoise() { return "WOOF!"; }
        };

        public abstract String makeNoise();
    }

}
