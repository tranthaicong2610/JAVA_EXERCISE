package generics.apply_method.b1;

public class GenericsMethod1 {
    public static <E> void printArray(E[] elements){
        for(E element : elements){
            System.out.print(element+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Integer[] intArray = {10,20,30,40,50};
        Character[] charArray = {'a','b','c','d'};
        System.out.println("in mang");
        printArray(intArray);
        printArray(charArray);
    }
}
