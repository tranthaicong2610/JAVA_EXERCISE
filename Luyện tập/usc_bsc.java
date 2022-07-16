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
public class usc_bsc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("uoc so chung lon nhat la "+usc(a,b));
        System.out.println("boi so chung nho nhat la :"+bsc(a,b));
    }

    private static String usc(int a, int b) {
        while(a!=b){
            if(a>b){
                a = a - b;
            }
            else b = b - a;
            
        }
        
        return Integer.toString(a) ;
    }

    private static String bsc(int a, int b) {
        int usc = Integer.parseInt(usc(a,b));
        int tich = a*b;
        return Integer.toString(tich/usc);
        
        
    }
}
