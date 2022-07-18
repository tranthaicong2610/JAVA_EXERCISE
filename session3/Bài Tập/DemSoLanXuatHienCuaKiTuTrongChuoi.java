/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Win 10
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi :");
        String s = scanner.nextLine();
        char c = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i))
                count++;
        }
        System.out.println("so lan xuat hien cua " + c + " trong chuoi " + s + "la :" + count);

    }

}
