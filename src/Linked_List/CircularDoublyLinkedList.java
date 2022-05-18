package Linked_List;

public class CircularDoublyLinkedList {
    Node head;
    Node tail;
    int size;

    //method to create a doubly linked list
    public Node createCDLL(int nodeValue){
        Node node=new Node();
        node.value=nodeValue;
        node.next=node;
        node.prev=node;
        head=tail=node;
        size=1;
        return head;
    }   

    // method to insert a new node in the linked list
    public Node insertCDLL(int nodeValue, int location){
        Node node=new Node();
        node.value=nodeValue;
        if(head==null){
            createCDLL(nodeValue);
            return null;
        }
        else if(location==0){
            node.prev=tail;
            node.next=head;
            tail.next=node;
            head.prev=node;
            head=node;
        }
        else if(location>size-1){
            node.next=head;
            node.prev=tail;
            tail.next=node;
            head.prev=node;
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
            tempNode.next.prev=node;
        }
        size++;
        return null;
    }

    //method to traverse the circular doubly linked list
    public void traverseCDLL(){
        if(head==null){
            System.out.println("The linked list does not exist");
        }
        else{
            Node tempNode=head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i<size-1){
                    System.out.print(" -> ");
                }
                tempNode=tempNode.next;
            }
            System.out.println("\n");
        }
    }

    //method to reverse traverse a circular doubly linked list
    public void reverseTraverseCDLL(){
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

    //method to search a value in circular doubly linked list
    public boolean searchInCDLL(int nodeValue){
        if(head==null){
            System.out.println("The linked list does not exist");
            return false;
        }
        else{
            Node tempNode=head;
            for(int i=0;i<size;i++){
                if(tempNode.value==nodeValue){
                    System.out.println("The value found at index "+i);
                    return true;
                }
                tempNode=tempNode.next;
            }
            System.out.println("Value not found");
            return false;
        }
    }

    //method to delete a node in circular doubly linked list
    public void deleteInCDLL(int location){
        if(head==null){
            System.out.println("The linked list does not exist");
        }
        else if(location==0){
            if(size==1){
                head.next=null;
                head.prev=null;
                head=null;
                tail=null;
                size--;
            }
            else{
                head=head.next;
                tail.next=head;
                head.prev=tail;
                size--;
            }
        }
        else if(location>size-1){
            if(size==1){
                head.next=null;
                head.prev=null;
                head=null;
                tail=null;
                size--;
            }
            else{
                tail=tail.prev;
                head.prev=tail;
                tail.next=head;
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

    //method to delete an entire cdll
    public void deleteEntireCircularDoublyLinkedList(){
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
