/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_tutorials;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Win 10
 */
public class SoArmstrongNhoHonN {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap so n :");
        int n = scanner.nextInt();
        for(int i =0;i<=n;i++){
            if (check(i)){
                System.out.print(" "+i);
            }
        }
                
    }
    private static boolean check(int n) {
        int tem = n ;
        //1634  -> 1 6 3 4
        ArrayList<Integer> armstrong_list = new ArrayList<Integer>();
        while(tem!=0){
            armstrong_list.add(tem%10);
            tem = tem/10; 
        }
        int sum = 0;
        for (int i=0;i<100 ;i++){
           sum = 0;
           for(int j = 0 ;j<armstrong_list.size();j++ ){
               sum =  sum + (int)Math.pow(armstrong_list.get(j),i);
               
           }
           if (sum == n ) return true;
           if (sum > n ) return false;
        }
        return false;
    }
    
}
