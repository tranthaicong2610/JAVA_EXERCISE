/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_tutorials;

import java.util.Scanner;

/**
 *
 * @author Win 10
 */
public class Java_tutorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap mot so : ");
//        int n = scanner.nextInt();
//        int i =2;
//        while(n!=0){
//            if (check(i)){
//                System.out.print(i +" ");
//                n--;
//            }
//            i++;
//        }
        String s = scanner.nextLine();
        StringBuilder k = new StringBuilder();
        k.append(s);
        k.reverse();
        String s1 = k.toString();
        if (s1.equals(s)) System.out.println("doi xung");
        else System.out.println("ko doi xugng");
        
                
    }

    private static boolean check(int i) {
        if (i<2) return false;
        for(int j=2;j<=Math.sqrt(i);j++){
            if (i % j==0) return false;
        }
        return true;
    }
    
}
