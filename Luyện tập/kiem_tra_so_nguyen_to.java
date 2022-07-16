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
public class kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        /*
        kiêm tra số nguyên tô 
        chỉ chia hết cho 1 và chính nó ngoại trừ số 1 
        c1 : viết thẳng thuật toán trong ham main
        
        c2 viet mot ham kiem tra 
        goi ham trong ham main
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so can kiem tra :");
        int n = sc.nextInt();
//        if (n < 2 ) 
//            System.out.println("day ko la so nguen to ");
//        else{
//            boolean check = true;
//            for (int i=2 ;i<=Math.sqrt(n);i++){
//                if(n % i ==0) {
//                    check = false;
//                    System.out.println("day ko la so nguyen to");
//                    break;
//                }
//                
//            }
//            if (check==true) System.out.println("day la so nguyen to");
//        }
        if(check(n)==true) System.out.println("day la so nguyen to");
        else System.out.println("day ko la so nguyen to");
                
     }
    static boolean check(int n){
        if (n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
