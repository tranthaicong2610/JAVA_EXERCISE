/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session6.baitap.b1;

/**
 *
 * @author Win 10
 */
public class Circle {
    public final double PI = 3.14;
    private double radius;
    private double color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getColor() {
        return color;
    }

    public void setColor(double color) {
        this.color = color;
    }
    public double area(){
        return this.PI*this.radius *this.radius;
        
    }

}
