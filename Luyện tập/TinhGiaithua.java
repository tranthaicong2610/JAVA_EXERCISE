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
public class TinhGiaithua {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so n :");
        int n = scanner.nextInt();
        int res = 1 ;
        for (int i = 1;i<=n;i++){
            res *= i;
            
        }
        System.out.println("ket qua cua bai toan theo c1 la :"+res);
        System.out.println("ket qua cua bai toan theo cach 2 la :"+tinhgiaithua(n));
    }
    static int tinhgiaithua(int n){
        if (n==0) return 1;
        return n*tinhgiaithua(n-1);
    }
}
