package main.java;

public class Test2 {

    Test2() {
        System.out.println("TEST2");
    }

     void printMethod() {
        System.out.println("Print Mehod 2");
    }

    static class Test3 extends Test2 {
        Test3() {
            System.out.println("TEST3");
        }

        void printMethod() {
            System.out.println("Print Mehod 3");
        }
    }

    static class Test4 extends Test3 {
        Test4() {
            System.out.println("TEST4");
        }

        void printMethod() {
            System.out.println("Print Mehod 4");
        }
    }

    public static void main(String[] args) {
        Test4 test4 = new Test4();
        test4.printMethod();
        test4.getClass();

        Abstract anAbstract= new Abstract() {
            @Override
            protected void printText() {
                System.out.println("again");
            }
        };
        anAbstract.printText();
    }
}

