package comparable.b1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Simpson implements Comparable<Simpson>{
    String name ;

    public Simpson(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Simpson simpson) {
        return this.name.compareTo(simpson.name);
    }

    @Override
    public String toString() {
        return "Simpson{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Simpson> simpsons = new ArrayList<>();
        simpsons.add(new Simpson("duc"));
        simpsons.add(new Simpson("cong"));
        simpsons.add(new Simpson("hoang"));
        simpsons.add(new Simpson("linh"));
        Collections.sort(simpsons);
        for(Simpson item :simpsons){
            System.out.println(item.toString());
        }
        System.out.println("-------------------------------");
        Collections.reverse(simpsons);
        for(Simpson item : simpsons){
            System.out.println(item);
        }

    }
}
