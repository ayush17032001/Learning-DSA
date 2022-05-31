package LinearQueue_using_Array;

public class Queue {
    int arr[];
    int topOfQueue;    //denotes the position of top element 
    int startOfQueue;  // denotes the position of starting element in the declared array 

    //constructor class for instance variables initialization
    public Queue(int size){
        this.arr=new int[size];
        this.startOfQueue=-1;
        this.topOfQueue=-1;
        System.out.println("the queue is created with size of "+size);
    }

    //isFull method
    public boolean isFull(){
        if(topOfQueue==arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }

    //isempty
    public boolean isEmpty(){
        if(startOfQueue==-1 || startOfQueue==arr.length){ //condition that might arise when we dequeue
            return true;
        }
        else{
            return false;
        }
    }

    //enQueue method
    public void enQueue(int value){
        if(isFull()){
            System.out.println("The queue is full");
        }
        else if(isEmpty()){
            startOfQueue=0; //start of queue is instantiated 
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println(value+" inserted at "+topOfQueue);
        }
        else{
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println(value+" inserted at "+topOfQueue);
        }
    }

    //dequeue method
    public int deQueue(){
        int deletedElement;
        if(isEmpty()){
            System.out.print("The queue is empty");
            return -1;
        }
        else{
            deletedElement=arr[startOfQueue];
            startOfQueue++;
            if(startOfQueue>topOfQueue){
                startOfQueue=topOfQueue=-1;
            }
            return deletedElement;
        }
    }

    //peek method
    public int peek(){
        if(isEmpty()){
            System.out.print("The queue is empty");
            return -1;
        }
        else{
            return arr[startOfQueue];
        }
    }

    //delete queue
    public void deleteQueue(){
        arr=null;
        System.out.println("The queue has been successfully deleted");
    }
}

