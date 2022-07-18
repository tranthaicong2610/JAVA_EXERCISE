package baitap.giai_phuong_trinh_bac_hai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        a= scanner.nextDouble();
        b= scanner.nextDouble();
        c= scanner.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        if (qe.getDiscriminant() == 0 ){
            System.out.println("phuong trinh co 2 ngiem bang nhau : " + qe.getRoot1());
        }
        else if (qe.getDiscriminant()<0){
            System.out.println("phuong trinh vo nghiem  ");
        }
        else {
            System.out.println("phuong trinh co 2 nghiem phan biet la : ");
            System.out.println("nghiem so 1 : "+qe.getRoot1());
            System.out.println("nghiem so 2 : "+qe.getRoot2());
        }

    }
}
