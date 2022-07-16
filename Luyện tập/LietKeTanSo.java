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
public class LietKeTanSo {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap so phan tu :");
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        int item;
        for (int i=0;i<n;i++){
            item= scanner.nextInt();
            list.add(item);
            list.add(item);
        }
        // xu ly code kiem tra so lan xuat hien 
        for (int i=0;i<n-1;i++){
            int count=1;
            if(list.get(i)>0){
                for(int j=i+1;j<n;j++){
                    if(list1.get(j) == list.get(i)){
                        count++ ;
                        list.set(j, 0);
                    }
                }
                System.out.print(list.get(i)+ " "+count);
            }
        }
        
    }
    
}
