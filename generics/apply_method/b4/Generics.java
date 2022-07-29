package generics.apply_method.b4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Generics {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"java");
        map.put(2,"php");
        map.put(3,"c++");
        Set<Map.Entry<Integer,String> > set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> iter = set.iterator();
        while(iter.hasNext()){
            Map.Entry e = iter.next();
            System.out.println(e.getKey() + " " +e.getValue());
        }

    }
}
