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
public class KiemTraSoChinhPhuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (check(n) == true ){
            System.out.println("day la so chinh phuong ");
        }
        else {
            System.out.println("day khong phai la so chinh phuong");
        }
                
    }

    private static boolean check(int n) {
        int k = (int)Math.sqrt(n);
        return k*k == n;
    }
    
}
