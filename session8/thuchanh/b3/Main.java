package session8.thuchanh.b3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("cong",30,"HT");
        Student student1 = new Student("linh",10,"BG");
        Student student2 = new Student("hoang",35,"SL");
        Student student3 = new Student("duc",37,"HT");
        List<Student> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student s :lists){
            System.out.println(s);
        }
        System.out.println("----------------");
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("so sanh theo tuoi :");
        for (Student st : lists){
            System.out.println(st.toString());
        }

    }
}
