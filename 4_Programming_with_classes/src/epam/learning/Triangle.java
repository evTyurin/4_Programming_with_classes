package epam.learning;

public class Triangle {
    private double ab;
    private double bc;
    private double ac;

    public void setAb(double ab) {
        this.ab = ab;
    }

    public void setAc(double ac) {
        this.ac = ac;
    }

    public void setBc(double bc) {
        this.bc = bc;
    }

    public double getAb() {
        return ab;
    }

    public double getAc() {
        return ac;
    }

    public double getBc() {
        return bc;
    }

    public double perimeter () {
        return perimetr(ab,bc,ac);
    }

    public static double perimetr (double ab, double bc, double ac) {
        return ab + bc + ac;
    }

    public double square () {
        double perimeter = perimeter();
        return Math.sqrt(perimeter/2*(perimeter/2 - ac) * (perimeter/2 - ab) * (perimeter/2 - bc));
    }

    public static Triangle getTriangle(){
        return new Triangle();
    }


}
