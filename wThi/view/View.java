package wThi.view;

import session10.baitap.b1.Product;
import wThi.controller.*;
import wThi.model.Account;
import wThi.model.AccountHistory;
import wThi.object_imp.*;

import java.io.*;
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
                System.out.println("nhap lai di sai roi");
            }
        } while (true);
        return number;
    }
    static double checkDouble(String mess) {
        double number = 0;
        System.out.println(mess);
        do {
            try {
                number = Double.parseDouble(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter integer");
            }
        } while (true);
        return number;
    }
    //    public static void writeToFile(String path, ArrayList<Account> accounts) {
//        try {
//            FileOutputStream fos = new FileOutputStream(path);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(accounts);
//            oos.close();
//            fos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public static ArrayList<Account> readDataFromFile(String path){
//        ArrayList<Account> list = new ArrayList<>();
//        try{
//            FileInputStream fis = new FileInputStream(path);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            list = (ArrayList<Account>) ois.readObject();
//            fis.close();
//            ois.close();
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//        return list;
//    }
    static void validateDate(String message, String regex) {
        boolean ok = true;
        while (ok) {
            String s = scanner.nextLine();
            s = s.trim();

            try {
                if (!s.toUpperCase().matches(regex)) {
                    throw new RuntimeException("loi dinh dang :");
                }
                ok = false;
                String[] k = s.split("/");
                int date, month, year;
                date = Integer.parseInt(k[0]);
                month = Integer.parseInt(k[1]);
                year = Integer.parseInt(k[2]);
                if (date < 0 || date > 31 || month < 0 || year < 0 || month > 12) {
                    throw new RuntimeException("nhap loi dinh dang . Moi ban nhap lại  ");
                }
            } catch (Exception e) {
                System.out.println("loi ban oi :");
                ok = true;
            }
        }
    }

    public static void main(String[] args) {
        boolean ok = true;

        System.out.println("1: Cho phep nhap Account luu vao file");
        System.out.println("2: In ra màn hình danh sách Account (đọc từ file vừa tạo) :");
        System.out.println("3: Nhập ID Account cho sửa thông tin Account. (Lưu tất cả thông tin vào file) :");
        System.out.println("4: Nhập ID Account cho xóa thông tin Account và AccountHistory. (Lưu tất cả thông tin vào file");
        System.out.println("5: Nhập tên vào tìm kiếm Account trong list đã nhập : ");
        System.out.println("6: In ra danh sách Account sắp xếp theo tên :");
        System.out.println("7: Chức năng trừ tiền, check tiền trong tài khoản có đủ không?  (đưa vào AccountHistory) (Lưu tất cả thông tin vào file) (xử lý synchronized) :");
        System.out.println("8: Chức năng cộng tiền (đưa vào AccountHistory). (Lưu tất cả thông tin vào file) (xử lý synchronized) :");
        System.out.println("9: hien thi menu");
        System.out.println("10: exit ");
        ArrayList<Account> list = new ArrayList<Account>();

        Account account = new Account("tran thai cong", "1354564", 1200);
        Account account1 = new Account("nguyen van bang", "1354564", 1200);
        Account account2 = new Account("tran thai ha", "1354564", 1200);
        Account account3 = new Account("tran thai duc", "1354564", 1200);
        Account account4 = new Account("nguyen thai duc", "1354564", 1200);
        list.add(account);
        list.add(account1);
        list.add(account2);
        list.add(account3);
        list.add(account4);
        ReadFileImp readFileImp = new ReadFileImp();
        WriteFileImp writeFile = new WriteFileImp();
        DisplayImp displayImp = new DisplayImp();
        EditImp editImp = new EditImp();
        DeleteImp deleteImp = new DeleteImp();
        SearchImp searchImp = new SearchImp();
        OderByNameImp oderByNameImp = new OderByNameImp();
        WithdrawMoneyImp withdrawMoneyImp = new WithdrawMoneyImp();
        ReadFileHistoryImp readFileHistoryImp = new ReadFileHistoryImp();
        RechargeImp rechargeImp = new RechargeImp();
        writeFile.writeToFile(list, "C:\\Users\\congtt15\\IdeaProjects\\untitled\\src\\wThi\\File\\input.txt");
//        ArrayList<Account> list1 = readFileImp.readDataFromFile("C:\\Users\\congtt15\\IdeaProjects\\untitled\\src\\wThi\\File\\input.txt");
//        for (Account item : list1) {
//            System.out.println(item);
//        }
        ArrayList<AccountHistory> accountHistories = new ArrayList<>();
        while (ok) {
            int run = checkInteger("Moi ban chon chuc nang : ");
            switch (run) {
                case 1:
                    String regex = "^[a-zA-Z\\s]+";
                    String name = inputString("moi ban nhap ten ",regex);
                    String accountNumber = inputString("moi ban nhap tai khoan :", "^[0-9]+");
                    double amount = checkDouble("moi ban nhap so tien :");
                    list.add(new Account(name, accountNumber,amount));
                    writeFile.writeToFile(list,"C:\\Users\\congtt15\\IdeaProjects\\untitled\\src\\wThi\\File\\input.txt");
                    break;
                case 2:
                    displayImp.display("C:\\Users\\congtt15\\IdeaProjects\\untitled\\src\\wThi\\File\\input.txt");
                    break;
                case 3:
                    int id = checkInteger("moi ban nhap id :");
                    String regex1 = "^[a-zA-Z\\s]+";
                    String name1 = inputString("moi ban nhap ten ",regex1);
                    String accountNumber1 = inputString("moi ban nhap tai khoan :", "^[0-9]+");
                    double amount1 = checkDouble("moi ban nhap so tien :");
                    editImp.edit(list,id,new Account(name1,accountNumber1,amount1));
                    writeFile.writeToFile(list,"C:\\Users\\congtt15\\IdeaProjects\\untitled\\src\\wThi\\File\\input.txt");
                    break;
                case 4:
                    int id1 = checkInteger("ban nhap id can  xoa :");
                    deleteImp.delete(list,id1);
                    break;

//                    ArrayList<Account> list1 = readFileImp.readDataFromFile("C:\\Users\\congtt15\\IdeaProjects\\untitled\\src\\wThi\\File\\input.txt");
//                    for (Account item : list1) {
//                        System.out.println(item);
//                    }
                case 5:
                    String nameSearch = inputString("moi ban nhap ten can tim kiem :","^[a-zA-Z\\s]+");
                    searchImp.searchName(list,nameSearch);
                    break;
                case 6:
                    oderByNameImp.orderByName(list);
                    break;
                case 7:
                    int id2 = checkInteger("ban nhap id muon rut tien :");
                    double soTienRut = checkDouble("ban nhap so tien muon rut :");
                    System.out.println("moi ban nhap mieu ta :");
                    String description = scanner.nextLine();
                    withdrawMoneyImp.withdrawMoney(list,accountHistories,id2,soTienRut,description);
                    break;
                case 8:
                    int id3 = checkInteger("ban nhap id muon nap tien :");
                    double soTienNap = checkDouble("ban nhap so tien muon nap :");
                    System.out.println("moi ban nhap mieu ta :");
                    String description1 = scanner.nextLine();
                     rechargeImp.rechargeMoney(list,accountHistories,id3,soTienNap,description1);
                    break;
                case 9:
                    System.out.println("1: Cho phep nhap Account luu vao file");
                    System.out.println("2: In ra màn hình danh sách Account (đọc từ file vừa tạo) :");
                    System.out.println("3: Nhập ID Account cho sửa thông tin Account. (Lưu tất cả thông tin vào file) :");
                    System.out.println("4: Nhập ID Account cho xóa thông tin Account và AccountHistory. (Lưu tất cả thông tin vào file");
                    System.out.println("5: Nhập tên vào tìm kiếm Account trong list đã nhập : ");
                    System.out.println("6: In ra danh sách Account sắp xếp theo tên :");
                    System.out.println("7: Chức năng trừ tiền, check tiền trong tài khoản có đủ không?  (đưa vào AccountHistory) (Lưu tất cả thông tin vào file) (xử lý synchronized) :");
                    System.out.println("8: Chức năng cộng tiền (đưa vào AccountHistory). (Lưu tất cả thông tin vào file) (xử lý synchronized) :");
                    System.out.println("9: hien thi menu");
                    System.out.println("10: exit ");
                    break;
                case 10:
                    ok=false;





            }

        }


    }
}
