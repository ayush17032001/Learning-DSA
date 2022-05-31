package Circularqueue_using_array;

public class Main {
    public static void main(String[] args) {
        CircularQueue cq=new CircularQueue(5);
        //boolean result =cq.isEmpty();
        //System.out.println(result);
        cq.enQueue(8);
        cq.enQueue(27);
        cq.enQueue(66);
        cq.enQueue(89);
        cq.enQueue(254);
        int result=cq.deQueue();
        System.out.println("The deleted element is "+result);
        result=cq.deQueue();
        System.out.println("The deleted element is "+result);
        cq.enQueue(9);
        cq.enQueue(25);
        result=cq.deQueue();
        System.out.println("The deleted element is "+result);
        result=cq.deQueue();
        System.out.println("The deleted element is "+result);
        result=cq.deQueue();
        System.out.println("The deleted element is "+result);
        result=cq.deQueue();
        System.out.println("The deleted element is "+result);
    }
}
