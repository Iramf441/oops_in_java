import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<Integer>();
        a1.add(99);
        a1.add(88);
        a1.addFirst(87);
        a1.addLast(100);
        System.out.println(a1.get(0)+a1.get(3));
        a1.remove(0);
        System.out.println(a1);
    }

    
}
