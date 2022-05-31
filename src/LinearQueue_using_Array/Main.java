package LinearQueue_using_Array;

public class Main {
   public static void main(String[] args) {
        Queue q= new Queue(5);
        //boolean result=q.isEmpty();
        //System.out.println(result);
        q.enQueue(26);
        q.enQueue(89);
        q.enQueue(24);
        q.enQueue(77);
        q.enQueue(023);
        int result = q.deQueue();
        System.out.println(result);
        int peekachu=q.peek();
        System.out.println(peekachu);
    }
}
