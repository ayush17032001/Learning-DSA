package Collection_framework_practise;
import java.util.*;
public class LearnSet {
    public static void main(String[] args) {
        Set <Integer> set=new TreeSet<>(Comparator.reverseOrder());
        set.add(54);
        set.add(254);
        set.add(37);
        System.out.println(set);
    }
}
