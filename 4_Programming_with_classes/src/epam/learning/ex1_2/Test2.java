package epam.learning.ex1_2;

public class Test2 {
    private int a;
    private int b;

    private  final static int DEFAULT_A = 3;
    private  final static int DEFAULT_B = 4;

    Test2 (int a, int b) {
        this.a = a;
        this.b = b;
    }

    Test2 () {
        this (DEFAULT_A, DEFAULT_B);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
