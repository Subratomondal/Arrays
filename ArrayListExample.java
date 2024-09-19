import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Syntex
        ArrayList<Integer> list = new ArrayList<>(4);

        // list.add(23);
        // list.add(22);
        // list.add(13);
        // list.add(43);
        // list.add(12);
        // list.add(23);

        // System.out.println(list.contains(234));
        // System.out.println(list);
        // list.set(0, 234);

        // list.remove(2);
        // System.out.println(list);


        for(int i =0; i<5;i++){
            list.add(sc.nextInt());
        }
        for(int i=0 ; i<5;i++){
            System.out.println(list.get(i)); // pass index here , list[index] syntex will not work here
        }

    }
}
