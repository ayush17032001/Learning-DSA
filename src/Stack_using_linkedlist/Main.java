package Stack_using_linkedlist;

public class Main {
    public static void main(String[] args) {
        Stack newstack=new Stack();
        newstack.push(22);  
        newstack.push(45);
        //System.out.println("Is the Stack empty?- "+ newstack.isEmpty());
        int result=newstack.pop();
        System.out.println("the element removed from the stack is "+ result);
    }
  
}
