package Linked_List_Questions;

public class Main {
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        LinkedList ll1=new LinkedList();
        ll.createLinkedList(5); 
        ll.insertInLinkedList(3);   
        ll.insertInLinkedList(7); 
        //ll.insertInLinkedList(26); 
        //ll.insertInLinkedList(85); 

        ll1.createLinkedList(8); 
        ll1.insertInLinkedList(1);   
        ll1.insertInLinkedList(4); 
        //ll1.insertInLinkedList(26); 
        //ll1.insertInLinkedList(85); 

        ll.traverseLinkedList();
        Questions qns= new Questions();
        qns.deleteDuplicates(ll);
        Node result=qns.nthToLast(ll,4);
        if(result==null){
            System.out.println("The node does not exist. Enter a valid value");
        }
        else{
            System.out.println(result.value);
        }
    }
}
