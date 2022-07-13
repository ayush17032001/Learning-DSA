package Collection_framework_practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {
        List <Integer> ll=new ArrayList<>();
        ll.add(54);
        ll.add(75);
        ll.add(93);
        ll.add(143);
        ll.add(584);
        ll.add(78);

        System.out.println(Collections.min(ll)); 
        Collections.sort(ll);
        System.out.println(ll);

    }
}
