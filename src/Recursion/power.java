package Recursion;

import java.util.*;
public class power {

    public static int pow(int n,int x)
    {
        if(x<0)
            return -1;
        if(x==0)
            return 1;
        return n*pow(n,x-1);
    }

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter a no");
        int n=sc.nextInt();
        int product= pow(n,4);
        System.out.println("The result is "+product);
        }
        finally{
            sc.close();
        }
       
    }
    
    
}
