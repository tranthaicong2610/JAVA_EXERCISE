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
        int n;
        System.out.println("nhap so canh :");
        n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("mang tu tao la :");
        xuat(n, arr);

        resolt(n, arr);

    }

    static void xuat(int n, int[][] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void resolt(int n, int[][] arr) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
        }
        System.out.println("tong duong cheo chinh la : " + sum);
    }
}
