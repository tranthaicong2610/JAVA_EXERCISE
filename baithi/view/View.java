package baithi.view;

import baithi.controller.HocSinhController;
import baithi.model.HocSinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class View {
    private static Scanner scanner = new Scanner(System.in);

    static String inputString(String message, String regex) {
        System.out.println(message);
        String s = "";
        do {
            s = scanner.nextLine().trim();
            if (s.toUpperCase(Locale.ROOT).matches(regex)) {
                break;
            } else System.out.println("nhap sai roi ban :");
        }
        while (true);
        return s;
    }

    static int checkInteger(String mess) {
        int number = 0;
        System.out.println(mess);
        do {
            try {
                number = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter integer");
            }
        } while (true);
        return number;
    }

    public static void main(String[] args) {
        boolean ok = true;
        System.out.println("1: chuc nang cho phep them hoc sinh vao cac lop");
        System.out.println("2: chuc nang in ra man hinh hoc sinh cac LOP 1A 1B 1C :");
        System.out.println("3: chuc nang Sua thong tin hoc sinh qua id :");
        System.out.println("4: chuc nang  xoa thong tin hoc sinh qua id :");
        System.out.println("5: chuc nang tim kiem theo ten : ");
        System.out.println("6: chuc nang sap xep hoc sinh theo ten :");
        System.out.println("7: chuc nang nhap nam sinh in ra danh sach hoc sinh nam do :");
        ArrayList<HocSinh> list = new ArrayList<HocSinh>();
        HocSinh h1 = new HocSinh("Tran Thai Cong", "2000-12-12","LOP 1A");
        HocSinh h2 = new HocSinh("Nguyen Van Hai", "2000-11-11","LOP 1B");
        HocSinh h3 = new HocSinh("Luu Tung Linh", "2000-10-10" ,"LOP 1C");
        HocSinh h4 = new HocSinh("Nguyen Hai Chau", "1997-10-10","LOP 1A");
        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        HocSinhController hocSinhController= new HocSinhController();
        while (ok) {


            int run = checkInteger("Moi ban chon chuc nang : ");
            switch (run) {
                case 1:
                    HocSinh hocSinh = new HocSinh();
//                    scanner.nextLine();
                    String tenLop = inputString("Moi ban nhap ten lop muon them hoc sinh dinh dang (LOP 1A|1B|1C)", "^[L][O][P][\\s][1][ABC]");
                    String hoTen = inputString("Moi ban nhap ho va ten cua hoc sinh : ", "^[a-zA-Z\\s]+");
                    String ngaySinh = inputString("Moi ban nhap ngay sinh cua hoc sinh (yyyy-mm-dd):", "^[0-9]{4}[-][0-9]{2}[-][0-9]{2}");
                    hocSinh.setHoTen(hoTen);
                    hocSinh.setNgaySinh(ngaySinh);
                    hocSinhController.add(list,hocSinh,tenLop);
//                    System.out.println(1);
                    break;
                case 2:
                    hocSinhController.display(list);
                    System.out.println(2);
                    break;
                case 3:
                    HocSinh hocSinh1 ;
//                    scanner.nextLine();
                    int id =checkInteger("Moi ban nhap id can sua :");
                    String tenLop1 = inputString("Ten lop sua thanh  (LOP 1A|1B|1C)", "^[L][O][P][\\s][1][ABC]");
                    String hoTen1 = inputString("Ten  Hoc sinh sua thanh  : ", "^[a-zA-Z\\s]+");
                    String ngaySinh1 = inputString("ngay thang nam sinh sua theo dinh dang (yyyy-mm-dd):", "^[0-9]{4}[-][0-9]{2}[-][0-9]{2}");
                    hocSinh1 = new HocSinh(hoTen1,ngaySinh1,tenLop1);
                    hocSinhController.edit(list,id,hocSinh1);
                    break;
                case 4:
//                    scanner.nextLine();
                    int id1 =checkInteger("Moi ban nhap id can xoa :");
                    hocSinhController.delete(list,id1);
//                    System.out.println(4);
                    break;
                case 5:
//                    scanner.nextLine();
                    String name = inputString("Moi ban nhap ten cann tim kiem ","^[a-zA-Z\\s]+");
                    hocSinhController.searchName(list,name);
//                    System.out.println(5);
                    break;
                case 6:
                    hocSinhController.sapXepTheoTen(list);
//                    System.out.println(6);
                    break;
                case 7:
//                    scanner.nextLine();
                    String year = inputString("Moi ban nhap nam sinh :","^[0-9]{4}");
                    hocSinhController.danhSachHocSinhTheoNamSinh(list,year);
//                    System.out.println(7);
                    break;
                case 0:
                    ok = false;
                    break;

            }

        }
    }
}
