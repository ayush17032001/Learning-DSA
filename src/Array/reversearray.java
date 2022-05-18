package Array;
import java.util.Arrays;
public class reversearray {
    public static void reverse(int array[]){
        int i,other,temp;
        for(i=0;i<array.length/2;i++){
            other=array.length-i-1;
            temp=array[i];
            array[i]=array[other];
            array[other]=temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int array1[]={1,2,3,4,5};
        reverse(array1);

    }
    
}
