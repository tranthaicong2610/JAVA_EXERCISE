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
public class Liet_ke_so_nguyen_to_nho_hon_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nguyen :");
        int n = scanner.nextInt();
        for (int i=2 ;i<= n ;i++){
            if (check(i) == true){
                System.out.print(i+" ");
            }
        }
                
    }

    private static boolean check(int n) {
        if ( n <2 ) return false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) return false;
        }
        return true;
        
    }
    
}
