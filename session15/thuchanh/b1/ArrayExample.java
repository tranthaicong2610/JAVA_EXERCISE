package session15.thuchanh.b1;

import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("danh sach phan tu cua mang : ");
        for(int i=0;i<100;i++){
            arr[i] = rd.nextInt();
            System.out.println(arr[i]+" ");
        }
        return arr;
    }

 }
