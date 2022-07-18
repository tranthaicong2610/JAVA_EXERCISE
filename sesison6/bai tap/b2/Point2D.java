/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session6.baitap.b2;

/**
 *
 * @author Win 10
 */
public class Point2D {

    private float x = 0;
    private float y = 0;

    public float getX() {
        return x;
    }

    public Point2D() {
    }

    public Point2D(float x , float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = new float[2];
        arr[0] = this.getX();
        arr[1] = this.getY();
        return arr;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Point2D{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

}
