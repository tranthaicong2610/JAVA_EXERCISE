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
public class GameOanTuTi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  s =scanner.nextLine();
        
        // dam - keo - la 
        int level = scanner.nextInt();
        if (level == 5 ){
            if (s.equals("dam")){
            System.out.println("may tra ve : la");
            }
            else if (s.equals("keo")){
                System.out.println("may tra ve : dam ");
            }
            else {
                System.out.println("may tra ve :keo");
            }
        }
        else {
            ArrayList<String> truonghop = new ArrayList<String>();
            truonghop.add("dam");
            truonghop.add("keo");
            truonghop.add("la");
            // dam => 0
            // la => 1
            // keo => 2
            double random =  Math.random();
            int dapan = (int)(random * 3 );
            if (s== "dam"){
                if (dapan ==0 ){
                    System.out.println("hoa ");
                }
                else if (dapan == 1){
                    System.out.println("may thang");
                }
                else {
                    System.out.println("may thua ");
                }
            }
            else if (s=="la"){
                if (dapan ==0 ){
                    System.out.println("may thua ");
                }
                else if (dapan == 1){
                    System.out.println("may hoa");
                }
                else {
                    System.out.println("may thang ");
                }
            }
            else {
                if (dapan ==0 ){
                    System.out.println("may thang ");
                }
                else if (dapan == 1){
                    System.out.println("may thua");
                }
                else {
                    System.out.println("may hoa ");
                }
            }
            
            
        }
    }
}
