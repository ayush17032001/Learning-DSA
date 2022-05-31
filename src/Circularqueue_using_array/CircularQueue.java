package Circularqueue_using_array;

public class CircularQueue {
    int arr[];
    int topOfQueue;
    int startOfQueue;
    int size; // will be used while dequeueing

    //constructor
    public CircularQueue(int size){
        arr= new int[size];
        topOfQueue=-1;
        startOfQueue=-1;
        this.size=size;
        System.out.println("queue created with size of "+size);
    }

    //isEmpty
    public boolean isEmpty(){
        if(startOfQueue==-1){
            return true;
        }
        else{
            return false;
        }
    }

    //isFull
    public boolean isFull(){
       if(topOfQueue==startOfQueue-1){
       return true;
       }
       else if(topOfQueue==arr.length-1 && startOfQueue==0){
           return true;
       }
       else{
           return false;
       }
    }

    //enqueue
    public void enQueue(int value){
        if(isFull()){
             System.out.println("The queue is already full");
        }
        else if(isEmpty()){
             startOfQueue=0;
             topOfQueue++;
             arr[topOfQueue]=value;
             System.out.println("The entered value is "+arr[topOfQueue]);
        }
        else{
            if(topOfQueue==arr.length-1){
                topOfQueue=0;
            }
            else{
                topOfQueue++;
            }
            arr[topOfQueue]=value;
            System.out.println("The entered value is "+arr[topOfQueue]);
        }
    }

    //deQueue in circular is different from linear
    public int deQueue(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        else{
            int deletedElement=arr[startOfQueue];
            arr[startOfQueue]=-Integer.MIN_VALUE;
            if(startOfQueue==topOfQueue){
                startOfQueue=topOfQueue=-1;
            }
            else if(startOfQueue==arr.length-1){
                startOfQueue=0;
            }
            else{
                startOfQueue++;
            }
            return deletedElement;
        }
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return Integer.MIN_VALUE;
        }
        else{
            return arr[startOfQueue];
        }
    }

    //delete queue
    public void deleteQueue(){
        arr=null;
        System.out.println("The queue has been deleted");
    }
}



