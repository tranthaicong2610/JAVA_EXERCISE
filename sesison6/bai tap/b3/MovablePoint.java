/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session6.baitap.b3;

/**
 *
 * @author Win 10
 */
public class MovablePoint extends Point {

    private float xSpeed = 0, ySpeed = 0;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = new float[2];
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return arr;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "{" + "xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "),speed ( "
                + this.getxSpeed() + " ," + this.getySpeed() + ")";
    }

    public MovablePoint move() {
        this.setX(this.getX() + this.xSpeed);
        return this;
    }

    public static void main(String[] args) {
        MovablePoint mo = new MovablePoint(1, 0, 1, 0);
        System.out.println(mo.toString());
        mo.setSpeed(1, 2);

        System.out.println(mo.move());
    }

}
