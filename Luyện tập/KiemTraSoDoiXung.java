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
public class KiemTraSoDoiXung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        long   n = scanner.nextLong();
//        long tem = n ;
//        long sum = 0 ;
//        while(tem!=0){
//            //121 
//            sum = sum*10 +tem%10;
//            tem = tem/10;
//            
//        }
//        if (sum == n ){
//            System.out.println("day la so doi xung");
//        }
//        else {
//            System.out.println("day ko la so doi xung");
//        }

        String s = scanner.nextLine();
        StringBuilder k = new StringBuilder();
        k.append(s);
        k.reverse();
        String s1 = k.toString();
        if (s.equals(s1)){
            System.out.println("day la so doi xung");
        }
        else {
            System.out.println("day ko la so doi xung");
        }
    }
    
}
