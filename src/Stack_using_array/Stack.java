package Stack_using_array;

public class Stack {
    int arr[];
    int topOfStack;
    int removedElement;

    //constructor method for initialising values for object attributes
    public Stack(int size){
        arr=new int[size];
        topOfStack=-1;
        System.out.println(size);
    }

    //isEmpty
    public boolean isEmpty(){
        if(topOfStack==-1){
        return true;
        }
        else{
            return false;
        }
    }

    //isFull
    public boolean isFull() {
        if(topOfStack==arr.length-1){
            //System.out.println("The Stack is full");
            return true;
        }
        else{
            return false;
        }
    }

    //push
    public void push(int element){
        if(isFull()){
            System.out.println("the Stack is already full");
        }
        else{
            arr[topOfStack+1]=element;
            topOfStack++;
            System.out.println("the value is successfully inserted");
        }
    }

    //pop
    public int pop(){
        if(isEmpty()){
            System.out.println("The Stack is empty");
            return Integer.MIN_VALUE;
        }
        else{
            removedElement=arr[topOfStack];
            topOfStack--;
            return removedElement;
        }
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("The Stack is empty");
            return Integer.MIN_VALUE;
        }
        else{
            return arr[topOfStack];
        }
    }

    //delete
    public void deleteStack(){
        arr=null;
        System.out.println("The Stack has been deleted");
    }
}
