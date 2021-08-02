package epam.learning;

public class Test1 {
    private int a;
    private int b;

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

    public void show () {
        System.out.println("a = " + a + " b = " + b);
    }

    public int getTotal () {
        return a + b;
    }

    public int getBiggerNumber () {
        return (a > b ? a : b);
    }
}
