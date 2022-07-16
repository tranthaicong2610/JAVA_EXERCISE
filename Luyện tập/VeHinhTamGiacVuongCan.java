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
public class VeHinhTamGiacVuongCan {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap canh cua tam giac :");
        int n = scanner.nextInt();
        System.out.println("cau hinh tam giac vuong can 1 : ");
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (j<=i)
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("cau hinh tam giac vuong can 2:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (j<=n-i+1){
                    System.out.print("* ");
                }
                
            }
            System.out.println();
        }
        System.out.println("cau hinh tam giac vuong can 3: ");
        for (int i=1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if (j>=n-i+1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("cau hinh tam giac vuong can so 4: ");
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (j>=i){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    
}
