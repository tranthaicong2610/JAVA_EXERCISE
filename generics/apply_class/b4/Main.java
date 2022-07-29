package generics.apply_class.b4;

import generics.apply_class.b2.Dictionary;

class Book<K,V> extends Dictionary<K,V>{
    public Book(K key, V value) {
        super(key, value);
    }
}
public class Main {
    public static void main(String[] args) {
        Book<String,String> l = new Book<String,String>("Study","hoc");
        String english = l.getKey();
        String vietnamese = l.getValue();
        System.out.println(english +" " +vietnamese);
    }
}
