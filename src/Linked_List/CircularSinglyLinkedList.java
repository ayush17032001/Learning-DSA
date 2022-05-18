package Linked_List;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    //method to create csll
    public Node createCSLL(int nodeValue){
        Node node=new Node();
        node.value=nodeValue;
        node.next=node;
        head=node;
        tail=node;
        size=1;
        return head;
    }

    //method to insert a link in csll
    public Node insertCSLL(int nodeValue, int location){
        Node node= new Node();
        node.value=nodeValue;
        if(head==null){
            createCSLL(nodeValue);
            return null;
        }
        else if(location==0){
            node.next=head;
            head=node;
            tail.next=node;
        }
        else if(location>size-1){
            node.next=tail.next;
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
            tempNode.next=node;
        }
        size++;
        return null;
    }

    //method to travere csll
    public void traverseCSLL(){
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
            System.out.print("\n");
        }
    }

    //method to search in a CSLL
    public boolean searchInCSLL(int nodeValue){
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
            } System.out.println("Value not found");
            return false;
        }
    }

    //method to delete a node
    public void deleteInCSLL(int location){
        if(head==null){
            System.out.println("The linked list does not exist");
        }
        if(location==0){
            head=head.next;
            tail.next=head;
            size--;
            if(size==0){
                head.next=null;
                head=null;
                tail=null; 
            }
        }
        else if(location>size-1){ 
            Node tempNode=head;
            int index=0;
            while(index<size-1){
                tempNode=tempNode.next;
                index++;
            }
            if(tempNode==head){       
                head.next=null;
                tail=head=null;
                size--;
            }
            tempNode.next=head;
            tail=tempNode;
            size--;
        }
        else{
            Node tempNode = head; //creating a node for traversal of linked list
            int index=0;
            while(index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            tempNode.next=tempNode.next.next;
            size--;
        } 
    }

    //method to delete the entire csll
    public void deleteEntireCSLL(){
        if(head!=null){
            head=null;
            tail.next=null;
            tail=null;
            System.out.println("The entire csll has been deleted");
        }
        else{
            System.out.println("The linked list does not exist");
        }


    }
}
