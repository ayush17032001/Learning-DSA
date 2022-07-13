package Collection_framework_practise;
import java.util.LinkedList;
import java.util.Queue;
public class LearnQueueLinkedList {
    
    public static void main(String[] args) {
        Queue <Integer> queue=new LinkedList<>();
        queue.add(56);
        queue.offer(75);
        queue.offer(22);
        queue.offer(22);
        queue.offer(22);
        System.out.println(queue);  
        queue.poll();
        System.out.println(queue); 
    }
}
