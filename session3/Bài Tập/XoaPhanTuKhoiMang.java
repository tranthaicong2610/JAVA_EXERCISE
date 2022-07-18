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

        int[] arr = new int[size];
        System.out.println("nhap cac phan tu cua mang");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("gia tri can xoa :");
        int value_del = scanner.nextInt();
        del_value(size, arr, value_del);

    }

    static void xuat(int size, int[] arr) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void del_value(int size, int[] arr, int value_del) {
        boolean check = false;
        for (int i = 0; i < size; i++) {
            if (value_del == arr[i]) {
                check = true;
                System.out.println("index del is :" + i);
                for (int j = i; j < size - 1; j++) {
                    arr[i] = arr[j + 1];

                }
                System.out.print("new array is :");
                xuat(size - 1, arr);
                break;

            }

        }
    }

}
