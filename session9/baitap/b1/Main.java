/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session9.baitap.b1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Win 10
 */
public class Main {
    public List<String> readFileText(String sourceFile,String targetFile){
        List<String> lis = new ArrayList<String>();
        try {
            // Doc file theo duong dan 
            File fileSource = new File(sourceFile);
            File fileTarget = new File(targetFile);
             
            // kiem tra neu file ko ton tai thi nem ra ngoai le .
            if(!fileSource.exists() || fileTarget.exists()){
                throw new FileNotFoundException();
            }
            // doc tung dong cua file va tien hanh cong tong
            BufferedReader br = new BufferedReader(new FileReader(fileSource));
            String line = "";
            int sum =0;
            while((line=br.readLine())!=null){
                lis.add(line);
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            // th file ko ton tai hoac noi dung file co loi thi se hien thi thong bao loi
            System.out.println("File nguon ko ton tai or noi dung co loi hoac"
                    + "file dich da ton tai");
            
        }
        return lis;
        
    }
    public void writeFile(String filePath, List<String> lists) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter buffered = new BufferedWriter(writer);
            for(String lis : lists){
                buffered.write(lis+"\n");
            }
            buffered.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        List<String> list = m.readFileText("E:\\k 2 nam 4\\java\\JAVA_EXERCISE\\input.txt","E:\\k 2 nam 4\\java\\JAVA_EXERCISE\\result1.txt");
        m.writeFile("E:\\k 2 nam 4\\java\\JAVA_EXERCISE\\result1.txt",  list);
    }
    
    
}
