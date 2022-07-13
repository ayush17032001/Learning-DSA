package Collection_framework_practise;
    import java.util.PriorityQueue;
    public class LearnPriorityQueue {
        public static void main(String[] args) {
            PriorityQueue <Integer> queue=new PriorityQueue<>();
            queue.add(89);
            queue.add(56);
            queue.add(27);
            queue.add(416);
            System.out.println(queue);
            queue.poll();
            System.out.println(queue);
            queue.poll();
            System.out.println(queue);
      
        }
    }

