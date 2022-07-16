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
public class KiemTraSoArmstrong {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap so n :");
        int n = scanner.nextInt();
        if (check(n)){
            System.out.println("day la so armstrong");
        }
        else 
            System.out.println("day ko la so armstrong");
                
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
               sum = (int) (sum + Math.pow(armstrong_list.get(j),i));
               
           }
           if (sum == n ) return true;
           if (sum > n ) return false;
        }
        return true;
    }
    
}
