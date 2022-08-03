package session10.baitap.b1;

import java.io.Serializable;

public class Product implements Serializable {

    private static int increase_id = 1;
    private int maSP;
    private String name;
    private String manufacturer;
    private double price;
    private String desc;

    public Product() {
        this.maSP = increase_id++;
    }

    public Product(String name, String manufacturer, double price, String desc) {
        this.maSP = increase_id++;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.desc = desc;
    }

    public int getMaSP() {
        return maSP;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Product{" + "maSP=" + maSP + ", name='" + name + '\'' + ", manufacturer='" + manufacturer + '\'' + ", price=" + price + ", desc='" + desc + '\'' + '}';
    }
}
