package session14.baitap;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static void nhapMang(int[] arr , int n ){
        System.out.println("nhap cac phan tu cua mang :");
        for(int i=0;i<n;i++) arr[i]= scanner.nextInt();

    }
    public static void main(String[] args) {
        // sap xep chen
        System.out.println("nhap so phan tu cua mang :");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr,n);
        SapXepChen sapXepChen = new SapXepChen();
        sapXepChen.sapXepChen(arr,n);
        //tim chuoi tang dan
        System.out.println("nhap chuoi can xu ly : ");
        scanner.nextLine();
        String s= scanner.nextLine();
        ChuoiLienTiep chuoiLienTiep= new ChuoiLienTiep();
        System.out.println(chuoiLienTiep.timChuoi(s));

        //tim kiem binary
        System.out.println("nhap so phan tu cua mang :");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        nhapMang(arr1,n1);
        SearchBinary search = new SearchBinary();
        System.out.println(search.searchBinary(arr1,0,n1-1,15));
        System.out.println("nhap chuoi can xu ly :");
        scanner.nextLine();
        // chuoi con tang dai nhat
        String s2= scanner.nextLine();
        ChuoiConTangDaiNhat c = new ChuoiConTangDaiNhat();
        System.out.println(c.resolt(s2));
    }
}
