package Queue_using_LinkedList;

public class Main {
    public static void main(String[] args) {
      Queue q=new Queue();
      System.out.println(q.isEmpty());
      q.enQueue(8);
      q.enQueue(81);
      q.enQueue(82);
      q.enQueue(18);
      System.out.println(q.deQueue());
      System.out.println(q.deQueue());
      System.out.println(q.deQueue());
      System.out.println(q.peek());
      q.delete();
    }
}
