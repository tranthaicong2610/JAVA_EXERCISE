package session14.baitap;

import java.util.Scanner;

public class ChuoiTangDaiNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = 1;
        }
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) > s.charAt(j)) {
                    arr[i] = Math.max(arr[j] + 1, arr[i]);
                }
            }
        }
        int start = 0, end = s.length()-1, count = 1;
        while (start <= end) {
            if (arr[start] == count) {
                count++;
                System.out.print(s.charAt(start));
            }
            start++;
        }

    }
}
