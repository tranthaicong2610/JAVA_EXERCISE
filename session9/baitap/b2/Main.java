package session9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<String> ReaderFile(String fileName ){
        List<String> lists = new ArrayList<String>();
        BufferedReader br = null;
        try {
            String line ;
            br = new BufferedReader(new FileReader(fileName));
            //  how to read file in java line by line ?
            while((line = br.readLine())!=null){
                String tem = line.replace("\"","");
                lists.add(tem.split(",")[2]);

            }
        }
        catch (IOException e){
            e.printStackTrace();

        }
        return lists;
    }
    public static void main(String[] args) {
        String fileName = "D:\\BaiTap\\java_exercise\\JAVA_EXERCISE\\file_test.csv";
        Main  m = new Main();
        List<String> res = new ArrayList<String>();
        res = m.ReaderFile(fileName);
        for(String item : res){
            System.out.println(item);
        }

    }
}
