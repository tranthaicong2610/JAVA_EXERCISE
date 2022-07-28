package session8.baitap.b1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        Product p1 = new Product("Apple",10);
        Product p2 = new Product("laravel",19);
        Product p3 = new Product("Applewatch",16);
        Product p4 = new Product("Galasy",12);
        Product p5 = new Product("Apple1",17);
        Product p6 = new Product("SamSung",15);
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        for(Product item : products){
            System.out.println(item);
        }
        ProductManager productManager = new ProductManager();
        System.out.println("---------------------");
        //test method add
        System.out.println("method add ");
        Product product = new Product("Django",15);

        productManager.add(products,product );
        for(Product item : products){
            System.out.println(item);
        }
        //method edit
        System.out.println("--------------");
        System.out.println("method edit ");
        productManager.edit(products, 1, "Hoang gia Tay Ban Nha",150);
        for(Product item : products){
            System.out.println(item);
        }
        // method delete
        System.out.println("--------------");
        System.out.println("method delete  ");
        productManager.delete(products, 5);
        for(Product item : products){
            System.out.println(item);
        }
        //method search name product
        System.out.println("--------------");
        System.out.println("method search  ");
        ArrayList<Product> res = new ArrayList<Product>();
        res = productManager.searchName(products,"SamSung");
        for(Product item : res){
            System.out.println(item);
        }
        // Sort up ascending
        System.out.println("--------------");
        System.out.println("method Sort up ascending price ");
        Collections.sort(products,productManager);
        for(Product item : products){
            System.out.println(item);
        }
        // decrease product
        System.out.println("--------------");
        System.out.println("method decrease Price   ");
        productManager.DecreaseProducts(products);
        for(Product item : products){
            System.out.println(item);
        }


    }
}
