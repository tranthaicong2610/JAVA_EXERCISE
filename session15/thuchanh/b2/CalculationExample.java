package session15.thuchanh.b2;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap x :");
        int x= scanner.nextInt();
        System.out.println("hay nhap y :");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x,y);

    }
    private void calculate(int a,int b){
        try {
            System.out.println("tong 2 so la : "+(a+b));
            System.out.println("hieu 2 so la : "+(a-b));
            System.out.println("tich 2 so la : "+(a*b));
            System.out.println("thuong 2 so la : "+(a/b));

        }
        catch (Exception e){
            System.out.println("xay ra ngoai le "+e.getMessage());
        }
    }
}
