package session15.thuchanh.b1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Vui long nhap chi so cua cac phan tu bat ky :");
        int x= scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so 5 "+ x+ " la :"+arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Chi muc vuot qua gioi han cua mang");
        }
    }
}
