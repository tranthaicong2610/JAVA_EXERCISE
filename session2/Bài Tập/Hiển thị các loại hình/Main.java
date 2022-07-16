/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Win 10
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println(
                "2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("Enter menu is :");
        int menu = scanner.nextInt();
        switch (menu) {
            case 1:
                System.out.println("height is :");
                int height,
                        width;
                height = scanner.nextInt();
                System.out.println("width is :");
                width = scanner.nextInt();
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("edge is");
                int edge = scanner.nextInt();
                for (int i = 0; i < edge; i++) {
                    for (int j = edge - 1; j >= i; j--) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println("----------------");

                for (int i = 0; i < edge; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println("----------------");

                for (int i = 0; i < edge; i++) {
                    for (int j = edge - 1; j >= 0; j--) {
                        if (j <= i) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }

                    }

                    System.out.println();
                }
                System.out.println("----------------");
                for (int i = 0; i < edge; i++) {
                    for (int j = 0; j < edge; j++) {
                        if (j >= i) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }

                    }

                    System.out.println();
                }
                break;
            case 3:
                System.out.println("edge is");
                int n = scanner.nextInt();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= 2 * n - 1; j++) {
                        if (j >= n - i + 1 && j <= n + i - 1) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }

                    }

                    System.out.println();
                }
                break;
            case 4:
                break;
            default:
                break;
        }
    }
}
