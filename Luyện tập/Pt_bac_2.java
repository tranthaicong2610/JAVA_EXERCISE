/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_tutorials;

import java.util.Scanner;

/**
 *
 * @author Win 10
 */
public class Pt_bac_2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap he so a :");
        float a = scanner.nextFloat();
        System.out.println("nhap he so b :");
        float b= scanner.nextFloat();
        System.out.println("nhap he so c :");
        float c = scanner.nextFloat();
        if (a== 0 ){
            if (b==0){
                if (c==0)
                    System.out.println("pt co vo so ngiem");
                else
                    System.out.println("pt vo ngiem ");
            }
            else{
                System.out.print("ngiem cua pt la :");
                System.out.print(-c/b);
            }
                
        }
        else {
            float delta = b*b-4*a*c;
            if (delta<0){
                System.out.println("pt vo ngiem");
            }
            else if (delta == 0){
                System.out.println("pt co ngiem kep la :");
                System.out.println((-b)/(2*a));
            }
            else {
                System.out.println("pt co 2 ngiem phan biet :");
                System.out.println((-b + Math.sqrt(delta))/(2*a));
                System.out.println((-b - Math.sqrt(delta))/(2*a));
            }
        }
    }
}
