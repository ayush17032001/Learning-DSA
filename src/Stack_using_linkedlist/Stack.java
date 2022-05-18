package Stack_using_linkedlist;

public class Stack {
    LinkedList ll;
    
    //constructor to initialize object attributes
    //constructor has no return type
    public Stack(){
        ll=new LinkedList();
    }

    //pushing elements in stack means inserting it in the beginning-
    //of the linked list if we're implementing the stack using ll
    public void push(int value){
        ll.insertLinkedList(value,0);
        System.out.println("Insertion successful. Value = "+ value);
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

    //Pop
    public int pop(){
        int poppedElement=Integer.MIN_VALUE;
        if(isEmpty()){
            System.out.println("The Stack is empty");
        }
        else{
            poppedElement=ll.head.value;
            ll.deletionOfNode(0);
            return poppedElement;
        }
        return poppedElement;
    }

    //Peek
    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return Integer.MIN_VALUE;
        }
        else{
            return ll.head.value;
        }
    }

    //delete
    public void deleteStack(){
        ll.head=null;
        System.out.println("The stack is deleted");
    }
}
