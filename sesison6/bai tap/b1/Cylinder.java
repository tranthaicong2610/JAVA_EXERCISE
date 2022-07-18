/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session6.baitap.b1;

/**
 *
 * @author Win 10
 */
public class Cylinder extends Circle {

    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return this.PI*this.getRadius()*this.getRadius() * this.getHeight();
    }

    public static void main(String[] args) {
        
        Cylinder c = new Cylinder();
        c.setRadius(10);
        c.setHeight(5);
        
        System.out.println("dien tich hinh tron :"+c.area());
        System.out.println("the tich hinh tru :" +c.volume());

    }

}
