package session10.thuchanh.b2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    public static List<Student> readDataFromFile(String path){
        List<Student>  students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return students;

    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Nguyen dinh van ","trung quoc"));
        students.add(new Student(2,"Nguyen dong do ","vu han "));
        students.add(new Student(3,"Nguyen truong xuan  ","nam dinh  "));
        writeToFile("D:\\BaiTap\\java_exercise\\JAVA_EXERCISE\\file_test_read_write\\test10_b2.txt",students);
        List<Student> studentDataFromFile = readDataFromFile("D:\\BaiTap\\java_exercise\\JAVA_EXERCISE\\file_test_read_write\\test10_b2.txt");
        for(Student student : studentDataFromFile){
            System.out.println(student);
        }

    }
}
