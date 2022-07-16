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
public class TimSoFifo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so n :");
        int n = scanner.nextInt();
        int f0 = 1 ,f1 = 1;
        while(n!=1){
            int tem = f1;
            f1 += f0; // f1 = f1 +f0
            f0 = tem ;// f0 = f1 
            n--;
        }
        System.out.println("day la ket qua :" + f1);
        
    }
}
