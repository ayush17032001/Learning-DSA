package Linked_List;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    //method to create a doubly linked list
    public Node createDoublyLinkedList(int nodeValue){
        Node node=new Node();
        node.value=nodeValue;
        node.next=null;
        node.prev=null;
        head=tail=node;
        size=1;
        return head;
    }

    //method to insert a node in doubly linked list
    public Node insertDoublyLinkedList(int nodeValue, int location){
        Node node= new Node();
        node.value=nodeValue;
        if(head==null){
            createDoublyLinkedList(nodeValue);
        }
        else if(location==0){
            node.next=head;
            node.prev=null;
            head.prev=node;
            head=node;
        }
        else if(location>size-1){
            node.next=null;
            node.prev=tail;
            tail.next=node;
            tail=node;
        }
        else{
            Node tempNode=head;
            int index=0;
            while(index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            node.next=tempNode.next;
            node.prev=tempNode;
            tempNode.next=node;
            node.next.prev=node;
        }
        size++;
        return null;
    }

    //method to traverse the linked list
    public void traverseDoublyLinkedList(){
        if(head==null){
            System.out.println("The linked list does not exist");
        }
        else{
            Node tempNode=head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print(" -> ");
                }
                tempNode=tempNode.next;
            }
            System.out.println("\n");
        }
    }

    //method to reverse traverse a linked list
    public void reverseTraverseDoublyLinkedList(){
        if(head==null){
            System.out.println("The linked list does not exist");
        }
        else{
            Node tempNode=tail;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i<size-1){
                    System.out.print(" <- ");
                }
                tempNode=tempNode.prev;
            }
            System.out.println("\n");
        }
    }

    //method to search a value in linked list
    public boolean searchInDoublyLinkedList(int nodeValue){
        if(head==null){
            System.out.println("The linked list does not exist");
            return false;
        }
        else{
            Node tempNode=head;
            for(int i=0;i<size;i++){
                if(tempNode.value==nodeValue){
                    System.out.println("Value found at location "+i);
                    return true;
                }
                tempNode=tempNode.next;
            }
            System.out.println("Value not found");
            return false;
        }
    }

    //method to delete a node in linked list
    public void deleteInLinkedList(int location){
        if(head==null){
            System.out.println("The linked list does not exist");
        }
        else if(location==0){
            if(size==1){
                head=null;
                tail=null;
                size--;
            }
            else{
                head=head.next;
                head.prev=null;
                size--;
            }
        }
        else if(location>size-1){
            if(size==1){
                head=null;
                tail=null;
            }
            else{
                tail=tail.prev;
                tail.next=null;
                size--;
            }
        }
        else{
            Node tempNode=head;
            int index=0;
            while(index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            tempNode.next=tempNode.next.next;
            tempNode.next.prev=tempNode;
            size--;
        }
    }
    
    //method to delete an entire linked list
    public void deleteEntireDoublyLinkedList(){
        Node tempNode=head;
        int index=0;
        while(index<size){
            tempNode.prev=null;
            index++;
            tempNode=tempNode.next;
        }
        head=null;
        tail=null;
        System.out.println("The entire linked list has been deleted");
    }
}
