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
public class TinhTongDenN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so n :");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("ket qua c1 la :"+sum);
        int sum2 = (n*(n+1))/2;
        System.out.println("ket qua c2 la :"+sum2);
    }
    
}
