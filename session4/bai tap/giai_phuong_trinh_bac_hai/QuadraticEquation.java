package baitap.giai_phuong_trinh_bac_hai;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return Math.pow(this.b,2) - 4*a*c;

    }
    public double getRoot1(){
        return (-b+Math.sqrt(this.getDiscriminant()))/(2*this.a);
    }
    public double getRoot2(){
        return (-b-Math.sqrt(this.getDiscriminant()))/(2*this.a);
    }


}
