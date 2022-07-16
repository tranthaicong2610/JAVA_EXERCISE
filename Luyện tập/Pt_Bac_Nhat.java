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
public class Pt_Bac_Nhat {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap gia tri cua a :");
        float a = scanner.nextFloat();
        System.out.println("nhap gia tri cua b :");
        float b = scanner.nextFloat();
        if (a==0){
            if (b==0)
                System.out.println("day la pt vo so ngiem");
            else 
                System.out.println("day la phuong trinh vo nghiem ");
        }
        else {
            System.out.print("ngiem cua phuong trinh la :");
            System.out.print(-b/a);
        }
                
    }
    
}
