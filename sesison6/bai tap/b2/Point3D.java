/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session6.baitap.b2;

/**
 *
 * @author Win 10
 */
public class Point3D extends Point2D {

    private float z;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x , float y , float z ){
        this.setX(x);
        this.setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arr = new float[3];
        arr[0]= this.getX();
        arr[1]= this.getY();
        arr[2]= this.getZ();
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" + "z=" + z +
                "x=" + this.getX() +
                "y=" + this.getY() + '}';
    }
    
    

}
