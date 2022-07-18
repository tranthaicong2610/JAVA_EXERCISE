package baitap.bai2;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100001];
        for(int i =0;i<100000;i++){
            arr[i] = (int )(Math.random()*100000);
        }
        StopWatch sw = new StopWatch();
        sw.start();
        for (int i = 0; i < 100000; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < 100000; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        sw.stop();
        Duration diff = Duration.between(sw.getStartTime(), sw.getEndTime());
        System.out.println("thoi gian chay chuong trinh la :"+ diff.getSeconds() + "s-"+diff.getNano()+"nano giay");


    }
}
