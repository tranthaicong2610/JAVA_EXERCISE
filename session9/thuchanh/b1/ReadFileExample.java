/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session9.thuchanh.b1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Win 10
 */
public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            // Doc file theo duong dan 
            File file = new File(filePath);
             
            // kiem tra neu file ko ton tai thi nem ra ngoai le .
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            // doc tung dong cua file va tien hanh cong tong
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum =0;
            while((line=br.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            br.close();
            // hien thi ra man hinh tong cac so nguyen trong file 
            System.out.println("Tong = "+sum);
        } catch (Exception e) {
            // th file ko ton tai hoac noi dung file co loi thi se hien thi thong bao loi
            System.out.println("File ko ton tai or noi dung co loi");
            
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Nhap duong dan file :");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample readfile = new ReadFileExample();
        readfile.readFileText(path);
    }
    
}
