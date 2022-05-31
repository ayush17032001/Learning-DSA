package Queue_using_LinkedList;

public class Queue {
    LinkedList ll;

    //constructor to intialize LinkedList instance
    public Queue(){
        ll=new LinkedList();
    }

    //isEmpty
    public boolean isEmpty(){
        if(ll.head==null){
            return true;
        }
        else{
            return false;
        }
    }

    //enQueue
    public void enQueue(int value){
        ll.insertLinkedList(value, ll.size);
        System.out.println("Value inserted -> "+value);
    }

    //deQueue
    public int deQueue(){
        int deletedValue=0;
        if(isEmpty()){
            System.out.println("The queue is empty");
            return Integer.MIN_VALUE;
        }
        else{
            deletedValue=ll.head.value;
            ll.deletionOfNode(0);
            return deletedValue;
        }
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return Integer.MIN_VALUE;
        }
        else{
            return ll.head.value;
        }
    }

    //delete
    public void delete(){
        ll.deleteSLL();
    }
}
