package Array;

public class missing {
    
    public void missingnumber(){
        int []arr={1,2,4,5,6,7,8,9,10};
        for(int i=0;i<10;i++){
            if(arr[i]!=(i+1)){
                System.out.print("The missing number is "+ (i+1));
                break;
            }
        }
    }
}

