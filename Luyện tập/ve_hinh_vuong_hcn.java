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
public class ve_hinh_vuong_hcn {
    public static void main(String[] args) {
       /* 
        vẽ hình vuông :
        nhập vào canhanhj của hình 
        n = 3 
        
        * * * i = 1 ; j=1,2,3 
        * * * i = 2; j =1,2,3
        * * * i = 3; j =1,2,3
        
        */
       Scanner sc =new Scanner(System.in);
//        System.out.print("Nhap canh hinh vuong :");
//       int n = sc.nextInt();
//       for (int i=1;i<=n;i++){
//           for (int j =1;j<=n;j++){
//               System.out.print("* ");
//           }
//           System.out.println();
//       }
        
        /*
        chieu dai = 3
        chieu rong = 4
        
        * * * * i = 1; j=1,2,3,4 
        * * * * i = 2; j=1,2,3,4 
        * * * * i = 3; j=1,2,3,4 
*/
        System.out.println("nhap chieu dai: ");
        int chieu_dai = sc.nextInt();
        System.out.println("nhap chieu rong: ");
        int chieu_rong = sc.nextInt();
        for(int i=1;i<=chieu_dai;i++){
            for(int j =1;j<=chieu_rong;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    
}
