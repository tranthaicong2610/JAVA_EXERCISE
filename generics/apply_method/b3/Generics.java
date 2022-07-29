package generics.apply_method.b3;

import java.util.ArrayList;
import java.util.Iterator;
public class Generics {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("java");
        list.add("php");
        list.add("c++");

        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
