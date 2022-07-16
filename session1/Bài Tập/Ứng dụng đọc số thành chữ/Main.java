/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_tutorials;

import java.util.Scanner;

/**
 *
 * @author Win 10
 */
/*

*
 */
/*
 * th1 :
 * - chua cac so nho hon 10
 * - chua liet ke so 0 voi 10 trong ham (de kiem tra sau)
 * truongHop2 : số từ 11->19
 * th3 : tien to từ 21->99
 * //chu ý chường hợp số 20
 * 
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number  :");
        String number = scanner.nextLine();
        if (number.length() == 1) {
            char c = number.charAt(0);
            if (c == '0') {
                System.out.println("number is : zezo");
            } else {
                System.out.println("number is : " + truongHop1(c));
            }
        } else if (number.length() == 2) {
            char c1 = number.charAt(0);
            char c2 = number.charAt(1);
            if (c1 == '1') {
                System.out.println("number is :" + truongHop2(c2));
            } else {
                if (c1 == '2' && c2 == '0') {
                    System.out.println("number is : twenty");
                } else {
                    String tien_to = TienTo(c1);
                    String hau_to = truongHop1(c2);
                    if (!hau_to.equals("java vss")) {
                        System.out.println("number is :" + tien_to + " " + hau_to);
                    } else {
                        System.out.println("number is :" + tien_to);
                    }

                }

            }

        } else {
            char c1 = number.charAt(0);
            char c2 = number.charAt(1);
            char c3 = number.charAt(2);
            String tram = truongHop1(c1);
            if (c2 == '0') {
                if (c3 == '0') {
                    System.out.println("number is :" + tram + " hundred");
                } else {
                    System.out.println("number is :" + tram + " " + "hundred and " + truongHop1(c3));

                }

            } else if (c2 == '1') {
                System.out.println("number is :" + tram + " hundred and " + truongHop2(c3));
            } else {
                if (c1 == '2' && c2 == '0') {
                    System.out.println("number is : " + tram + "hundred and twenty");
                } else {
                    if (truongHop1(c3).equals("java vss")) {
                        System.out.println("number is :" + tram + " hundred and " + TienTo(c2));
                    } else {
                        System.out.println("number is :" + tram + " hundred and " + TienTo(c2) + " " + truongHop1(c3));
                    }
                }

            }

        }

    }

    static String truongHop1(char c) {
        switch (c) {
            case '1':
                return "one";
            case '2':
                return "two";
            case '3':
                return "three";
            case '4':
                return "four";
            case '5':
                return "five";
            case '6':
                return "six";
            case '7':
                return "seven";
            case '8':
                return "eight";
            case '9':
                return "nine";

        }
        return "java vss";
    }

    static String truongHop2(char c) {
        switch (c) {
            case '0':
                return "ten";
            case '1':
                return "eleven";
            case '2':
                return "twelve";
            case '3':
                return "thirteen ";
            case '4':
                return "fourteen";
            case '5':
                return "fifteen";
            case '6':
                return "sixteen";
            case '7':
                return "seventeen";
            case '8':
                return "eighteen";
            case '9':
                return "nineteen";
        }
        return "java vss";
    }

    static String TienTo(char c) {
        switch (c) {
            case '2':
                return "twenty";
            case '3':
                return "thirty";
            case '4':
                return "forty";
            case '5':
                return "fifty";
            case '6':
                return "sixty ";
            case '7':
                return "seventy";
            case '8':
                return "eighty";
            case '9':
                return "ninety";
        }

        return "java vss";
    }

}
