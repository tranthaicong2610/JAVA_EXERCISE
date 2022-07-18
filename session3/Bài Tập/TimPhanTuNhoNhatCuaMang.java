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
        int size = 0;
        System.out.println("nhap kich thuoc mang :");

        size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("nhap cac phan tu cua mang");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        xuat(size, arr);

    }

    static void xuat(int size, int[] arr) {
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] < arr[i + 1])
                arr[i + 1] = arr[i];
        }
        System.out.println("phan tu nho nhat la :" + arr[size - 1]);
    }

}
