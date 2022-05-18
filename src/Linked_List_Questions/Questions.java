package Linked_List_Questions;

import java.util.HashSet;

public class Questions {

    //method to delete duplicate elements in a linkedlist
    public void deleteDuplicates(LinkedList ll){
        HashSet<Integer> hs= new HashSet();
        Node current=ll.head;
        Node prev=null;
        int tempValue;
        while(current!=null){
            tempValue=current.value;
            if(hs.contains(tempValue)){  
                prev.next=current.next;
                ll.size--;
            }
            else{
                hs.add(tempValue);
                prev=current;
            }
            current=current.next;
        }
    }

    //method to return nth element from last in a linked list when size is given
    public void findNthElement(LinkedList ll, int nodeLocation){
        int location=ll.size-nodeLocation+1;
        if(ll.head==null){
            System.out.println("The linked List does not exist");
        }
        else if(location<=0){
            System.out.println("The specific location does not exist");
        }
        else{
            Node tempNode=ll.head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            System.out.println("the value is "+ tempNode.value);
        }
    }  
    
    //method to return nth element of a linked list when the size is not given
    public Node nthToLast(LinkedList ll, int location){
        Node p1=ll.head;
        Node p2=ll.head;
        for(int i=0;i<location;i++){
            if(p2==null){
                return null;
            }
            p2=p2.next;
        }
        while(p2!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }

    //method to position a ll based on an element 'x'. All elements les than x added to left and 
    //greater are added to the right
    //will do it later{}

    //add 2 no. represented by linked list in reverse order
    /* public LinkedList add2Numbers(LinkedList ll, LinkedList ll1){
        Node p1=ll.head;
        Node p2=ll1.head; */

    }
    

