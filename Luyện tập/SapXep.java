/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_tutorials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Win 10
 */
public class SapXep {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang :");
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int item;
        for (int i=0;i<n;i++){
            item = scanner.nextInt();
            list.add(item);
            
        }
//        for(int i=0 ;i<n;i++) {
//            System.out.print(list.get(i)+" ");
//        }
        //sap xep lai mang
//        System.out.println("sap xep tang dan");
//        for (int i=0;i<n-1;i++){
//            for (int j =i+1;j<n;j++){
//                if (list.get(i)>list.get(j)){
//                    int k = list.get(i);
//                    list.set(i,list.get(j));
//                    list.set(j, k);
//                    
//                }
//            }
//        }
//        for(int i =0;i<list.size();i++){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println("");
//        System.out.println("sap xep giam dan");
//        for (int i=0;i<n-1;i++){
//            for (int j =i+1;j<n;j++){
//                if (list.get(i)<list.get(j)){
//                    int k = list.get(i);
//                    list.set(i,list.get(j));
//                    list.set(j, k);
//                    
//                }
//            }
//        }
        Collections.sort(list);
        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
    
}
