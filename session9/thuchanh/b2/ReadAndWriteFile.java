/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session9.thuchanh.b2;

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
public class ReadAndWriteFile {

    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();

        } catch (Exception e) {
            System.out.println("File ko ton tai or noi dung co loi");
        }
        return numbers;

    }

    // tao phuong thuc de ghi file 
    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter buffered = new BufferedWriter(writer);
            buffered.write("gia tri lon nhat la :" + max);
            buffered.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // tim max 
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("E:\\k 2 nam 4\\java\\JAVA_EXERCISE\\input.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("E:\\k 2 nam 4\\java\\JAVA_EXERCISE\\result.txt", maxValue);
    }

    public void writeFile(String ek_2_nam_4javaJAVA_EXERCISEresult1txt, List<Integer> numbers) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
