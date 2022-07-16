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
public class djakdjh {
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
        ArrayList<Integer> list_armstrong = new ArrayList<Integer>();
        int tem=n ;
        while(n!=0){
            list_armstrong.add(n%10);
            n=n/10;
            
        }
        int sum = 0;
        for(int i=0;i<100;i++){
            sum=0;
            for(int j=0;j<list_armstrong.size();j++){
                sum +=Math.pow(list_armstrong.get(j),i);
                        
            }
            System.out.println("tong: "+sum);
            if (sum==tem ) return true;
            if (sum > tem ) return false;
        }
        return true;
                
    }
    
}
