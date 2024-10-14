public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double c, double b, double a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant() {
       return (this.b * this.b) - (4*this.a*this.c);
    }
}
