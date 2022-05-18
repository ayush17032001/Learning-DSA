package Stack_using_array;

public class Main {
    public static void main(String args[]){
        Stack newStack=new Stack(4);
        newStack.push(15);
        newStack.push(26);
        newStack.push(48);
        newStack.push(78);
        //newStack.push(6);
        int popped=newStack.pop();
        System.out.println(popped);
        popped=newStack.pop();
        System.out.println(popped);
        int peeked=newStack.peek();
        System.out.println("the element peeked is "+ peeked);
        newStack.deleteStack();
    }
}
