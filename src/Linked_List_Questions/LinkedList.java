package Linked_List_Questions;

public class LinkedList{
    Node head;
    Node tail;
    int size;

    //method to create linked list
    public void createLinkedList(int nodeValue){
        Node node=new Node();
        node.value=nodeValue;
        node.next=null;
        head=node;
        tail=node;
        size=1;
    }

    //method to add a new node to linked list
    public void insertInLinkedList(int nodeValue){
        Node node=new Node();
        node.value=nodeValue;
        node.next=null;  //inserting a new node at the end of the linked list
        tail.next=node;  //currently tail = the last node so if tail.next points to the new node therefore 
        tail=node;
        size++;
    }

    //method to traverse the linked list
    public void traverseLinkedList(){
        Node tempNode=head;
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            if(i <size-1){
                System.out.print(" -> ");
            }
            tempNode=tempNode.next;
        }
        System.out.println("\n");
    }
}