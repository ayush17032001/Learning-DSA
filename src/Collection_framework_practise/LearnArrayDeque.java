package Collection_framework_practise;
import java.util.*;
public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque <Integer> ardq=new ArrayDeque<>();
        ardq.offer(65);
        ardq.offer(014);
        ardq.offer(74);
        ardq.offerFirst(45);
        ardq.offer(37);
        System.out.println(ardq);
        ardq.poll();
        System.out.println(ardq.peekLast());
    }
}
