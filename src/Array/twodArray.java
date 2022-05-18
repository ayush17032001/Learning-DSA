package Array;
import java.util.*;


public class twodArray {
    public static void main(String []args)
    {   Scanner sc=new Scanner(System.in);
        try{
            int i,j;
            System.out.println("Enter the no. of rows");
            int m=sc.nextInt();
            System.out.println("Enter the no. of columns");
            int n=sc.nextInt();            
            int int2DArray[][]=new int[m][n];
            System.out.println("Enter the elements of array");

                for(i=0; i<m;i++){
                    for(j=0;j<n;j++){
                        int2DArray[i][j]=sc.nextInt();
                    }
                }
                System.out.println(Arrays.deepToString(int2DArray));   
            }

        finally{
            sc.close();
        }
    }
}
