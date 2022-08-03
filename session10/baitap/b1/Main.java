package session10.baitap.b1;

import session10.thuchanh.b2.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeToFile(String path, List<Product> products,Product product) {
        products.add(product);
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        File x = new File(path);
        try{
            FileInputStream fis = new FileInputStream(x);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }
    static void  displayProducts(String path){
        //read data from file
        List<Product>  products= readDataFromFile(path);
        for(Product product :products){
            System.out.println(product);
        }
    }
    static Product searchName(String name,String path){
        List<Product>  products= readDataFromFile(path);
        for (Product product : products){
            if(product.getName().equals(name))
                return product;
        }
        return null;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        String path =  "D:\\BaiTap\\java_exercise\\JAVA_EXERCISE\\file_test_read_write\\file_test_bt1.txt";
        products.add(new Product("Iphone 10","Apple", 200,"professional"));
        products.add(new Product("Iphone 11","Apple", 250,"professional"));
        products.add(new Product("Iphone 12","Apple", 300,"professional"));
        products.add(new Product("Iphone 13","Apple", 350,"professional"));
        products.add(new Product("Iphone 14","Apple", 400,"professional"));
        products.add(new Product("Galaxy A1","SamSung", 215,"professional"));
        products.add(new Product("Galaxy A2","SamSung", 265,"professional"));
        products.add(new Product("Galaxy A3","SamSung", 278,"professional"));
        products.add(new Product("Galaxy A4","SamSung", 315,"professional"));
        System.out.println("ghi du lieu vao file theo danh sach :");
        System.out.println("--------------------------");
        //write data to file
        writeToFile(path,products);
        //write a product to file
        System.out.println("them 1 san pham vao file :");
        Product product = new Product("Nokia3","Nokia",435,"Brick");
        System.out.println(product);
        System.out.println("-------------------------------");
        writeToFile(path,products,product);
        // display data from file

        System.out.println("hien thi du lieu tu file ra:");
        System.out.println("---------------------------");
        displayProducts(path);

        System.out.println("tim kiem san pham theo ten :");
        System.out.println("---------------------------");
        System.out.println(searchName("Galaxy A1",path));
    }

}
