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
        int size = 0;
        System.out.println("nhap kich thuoc mang :");

        size = scanner.nextInt();

        int[] arr = new int[size + 1];
        System.out.println("nhap cac phan tu cua mang");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("gia tri can chen :");
        int value_insert = scanner.nextInt();
        System.out.println("Vi tri can chen");
        int position_insert = scanner.nextInt();
        insertValue(size, arr, value_insert, position_insert);

    }

    static void xuat(int size, int[] arr) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void insertValue(int size, int[] arr, int value_insert, int position_insert) {
        if (position_insert < 0 && position_insert > size - 1) {
            System.out.println("ko chen duoc phan tu vao mang ...");
        } else {
            boolean check = false;
            for (int i = size; i > position_insert; i--) {
                arr[i] = arr[i - 1];

            }
            arr[position_insert] = value_insert;
            xuat(size + 1, arr);
        }

    }

}
