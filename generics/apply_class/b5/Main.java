package generics.apply_class.b5;

class Book<K,V,I> extends Dictionary<K,V>{
    private I info;
    public Book(K key, V value) {
        super(key, value);
    }

    public Book(K key, V value, I info) {
        super(key, value);
        this.info = info;
    }

    public I getInfo() {
        return info;
    }

    public void setInfo(I info) {
        this.info = info;
    }
}
public class Main {
    public static void main(String[] args) {
        Book<String,String,Integer> l = new Book<String,String,Integer>("Study","hoc",123456);
        String english = l.getKey();
        String vietnamese = l.getValue();
        int quantity = l.getInfo();
        System.out.println(english + " " +vietnamese+ " "+quantity);
    }
}
