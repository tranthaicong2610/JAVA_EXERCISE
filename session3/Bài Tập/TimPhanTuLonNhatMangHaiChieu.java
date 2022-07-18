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
        // xoa phan tu trong mang
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
        System.out.println("mang vua tao la ");
        xuat(row, columm, arr);

    }

    static void xuat(int row, int columm, int[][] arr) {
        int max_arr = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columm; j++) {
                if (max_arr < arr[i][j])
                    max_arr = arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("gia tri lon nhat la :" + max_arr);
    }

}
