package session15.baitap;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float a, b, c;
        System.out.print("nhap canh a : ");
        a = scanner.nextFloat();
        System.out.print("nhap canh b : ");
        b = scanner.nextFloat();
        System.out.print("nhap canh c : ");
        c = scanner.nextFloat();
        TriangleController triangleController = new TriangleController();
        triangleController.checktriango(a, b, c);

    }
}
