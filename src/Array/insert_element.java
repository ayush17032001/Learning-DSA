package Array;

public class insert_element {
    int arr[]=null;
    public void SingleDimensionArray(int sizeOfArray){
        arr=new int[sizeOfArray];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int location, int valueInserted){
        try{
            if(arr[location]==Integer.MIN_VALUE){
                arr[location]=valueInserted;
                System.out.println("value inserted successfully");
            }
            else{
                System.out.println("Cell is already occupied");
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index of array");
        }
    }

    public static void main(String args[]){
        insert_element sda=new insert_element();
        sda.SingleDimensionArray(5);
        sda.insert(0,55);
        sda.insert(1,99);
        sda.insert(1,88);
        sda.insert(5,00);  
    }
}

    
