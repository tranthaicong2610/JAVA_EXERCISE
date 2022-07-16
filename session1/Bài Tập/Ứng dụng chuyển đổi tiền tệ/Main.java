/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Win 10
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rate = 23000;
        System.out.println("nhap so usd doi :");
        float usd = scanner.nextFloat();
        System.out.println(usd * rate + " vnd");

    }

}
