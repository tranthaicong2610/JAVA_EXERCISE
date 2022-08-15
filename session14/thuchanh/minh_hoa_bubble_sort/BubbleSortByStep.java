package session14.thuchanh.minh_hoa_bubble_sort;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println(" Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.print(" Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t ");
        }
        bubbleSortStep(list);
    }

    public static void bubbleSortStep(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j+1]) {
                    int tem = list[j];
                    list[j] = list[j+1];
                    list[j+1] = tem;
                    needNextPass = true;
                }
            }
            for(int k =0;k<list.length;k++){
                System.out.print(list[k]+" ");
            }
            System.out.println();
        }
    }
}
