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
public class KiemTraAutomocphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so kiem tra :");
        int n = sc.nextInt();
        if (check(n)){
            System.out.println("day la so automocphic");
        }
        else 
            System.out.println("day ko la so automocphic");
    }

    private static boolean check(int n) {
        int k =n ;
        int count =0;
        while(k!=0)
        {
            k=k/10;
            count++;
        }
        
        k = (int) Math.pow(n, 2);
        int sodu = k-n ;
        int test = (int) Math.pow(10, count);
        if (sodu % test ==0){
            return true;
        }
        return false;
        
    }
    
}
