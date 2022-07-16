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
public class TamGiacVuongCanRong {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("canh vuong can cua tam giac :");
        int n = scanner.nextInt();
        System.out.println("cau hinh so 1 ");
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if (i==n || j==1 || j== i)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
                        
            }
            System.out.println();
        }
        System.out.println("cau hinh so 2 :");
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if (i==1 || j==1 || j== n-i+1)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
                        
            }
            System.out.println();
        }
        System.out.println("cau hinh so 3 :");
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if (i==n || j==n || j== n-i+1)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
                        
            }
            System.out.println();
        }
        System.out.println("cau hinh so 4 :");
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if (i==1 || j==n || j== i)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
                        
            }
            System.out.println();
        }
    }
    
}
