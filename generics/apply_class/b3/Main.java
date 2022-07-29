package generics.apply_class.b3;

import generics.apply_class.b2.Dictionary;

class Book extends Dictionary<String,String>{
    public Book(String key, String value) {
        super(key, value);
    }
}
public class Main {
    public static void main(String[] args) {
        Book l = new Book("study","hoc");
        String english = l.getKey();
        String vietnamese = l.getValue();
        System.out.println(english + " "+vietnamese);
    }

}
