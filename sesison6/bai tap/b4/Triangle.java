/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session6.baitap.b4;

/**
 *
 * @author Win 10
 */
public class Triangle extends Shape {

    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double p = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));

    }

    @Override
    public String toString() {
        return "Triangle{" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3
                + "chu vi la :" + getPerimeter()
                + "dien tich la :" + super.toString() + '}';
    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,2,3);
        triangle.setColor("red");
        System.out.println(triangle);
    }

}
