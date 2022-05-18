package Linked_List;

public class SinglyLinkedList {
    public Node head; //head reference
    public Node tail; //tail reference
    public int size; //for the size of ll

    //method to create a node of ll
    public Node createSinglyLinkedList(int nodeValue) 
    {
        head =new Node(); //initialising head
        Node node =new Node(); //creating object of "Node" class
        node.next=null;
        node.value=nodeValue;
        head=node;
        tail=node;
        size=1;
        return head;
    }

    // method to insert a new node
    public Node insertLinkedList(int nodeValue, int location){
          Node node = new Node(); //creating object of "Node" class
          node.value=nodeValue;
          if (head==null){
            createSinglyLinkedList(nodeValue);
            return null;
          }
          else if(location==0){
              node.next=head;
              head=node;
          }
          else if(location >= size){
              node.next=null;
              tail.next=node;
              tail=node;
          }
          else {
              Node tempNode = head; //creating a node for traversal of linked list
              int index=0;
              while(index<location-1){
                  tempNode=tempNode.next;
                  index++;
              }
              Node nextNode=tempNode.next;
              tempNode.next=node;
              node.next=nextNode;
          }
          size++;
          return null;
    }

    // traversing Singly Linked List
    public void traverseSinglyLinkedList(){
        if(head==null){
            System.out.println("The linked List does not exist");
        }
        else{
            Node tempNode=head;
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            if(i<size-1){
                System.out.print(" --> ");
            }
            tempNode=tempNode.next;
        }
        System.out.println("\n");
      }
    }

    //Searching in Singly linked list
    public boolean searchSinglyLinkedList(int nodeValue){
        if (head ==null){
            System.out.println("The linked list does not exist");
            return false;
        }
        Node tempNode=head;
        for(int i=0;i<size;i++){
            if(tempNode.value==nodeValue){
                System.out.println("Value found at location: "+i);
                return true;
            }
            tempNode=tempNode.next;
        }
        System.out.println("Value not found in linked list");
        return false;
    }

    //method to delete a node
    public void deletionOfNode(int location){
        if(head==null){
            System.out.println("The linked list does not exist");
        }
        else if(location==0){
            head=head.next;
            size--;
            if(size==0){
                tail=null;
            }
        }
        else if(location>size-1){
            Node tempNode = head; //creating a node for traversal of linked list
            int index=0;
            while(index<size-1){
                tempNode=tempNode.next;
                index++;
            }
            if(tempNode==head){
                head=tail=null;
            }
            else{
                tempNode.next=null;
                tail=tempNode;
            }
            size--;
        }
        else{
            Node tempNode = head; //creating a node for traversal of linked list
            int index=0;
            //loop to traverse the linked list upto the desired node
            while(index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            tempNode.next=tempNode.next.next;
            size--;
        }
    }

    //delete entire single linked list
    public void deleteSLL(){
        head =null;
        tail=null;
        System.out.println("The linked list deleted successfully");
    }

}
