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
        int row, columm;
        System.out.println("nhap hang :");
        row = scanner.nextInt();
        System.out.println("nhap cot : ");
        columm = scanner.nextInt();
        int[][] arr = new int[row][columm];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columm; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("mang tu tao la :");
        xuat(row, columm, arr);
        System.out.println("nhap cot can tinh tong :");
        int index_sum_columm = scanner.nextInt();

        resolt(row, columm, arr, index_sum_columm);

    }

    static void xuat(int row, int columm, int[][] arr) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columm; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void resolt(int row, int columm, int[][] arr, int index_sum_columm) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += arr[i][index_sum_columm];
        }
        System.out.println("tong cot " + index_sum_columm + " la :" + sum);
    }
}
