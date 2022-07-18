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
        int size1 = 0;
        System.out.println("nhap kich thuoc mang 1:");

        size1 = scanner.nextInt();

        int[] arr1 = new int[size1];
        System.out.println("nhap cac phan tu cua mang 1");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        int size2 = 0;
        System.out.println("nhap kich thuoc mang 2 :");

        size2 = scanner.nextInt();

        int[] arr2 = new int[size2];
        System.out.println("nhap cac phan tu cua mang 2");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            arr3[i] = arr1[i];

        }
        for (int i = 0; i < size2; i++) {
            arr3[size1 + i] = arr2[i];
        }
        xuat(size2 + size1, arr3);

    }

    static void xuat(int size, int[] arr) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
