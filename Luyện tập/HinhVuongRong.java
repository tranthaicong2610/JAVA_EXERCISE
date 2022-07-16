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
public class HinhVuongRong {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap canh hinh vuong :");
        int n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i==1 || i==n || j==1 || j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("nhap canh a hcn :");
        int a = scanner.nextInt();
        System.out.println("nhap canh b hcn :");
        int b = scanner.nextInt();
        for (int i=1;i<=a;i++){
            for(int j =1; j<=b ;j++){
                if (i==1 || i==a ||j==1 ||j==b)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
            
    
}
