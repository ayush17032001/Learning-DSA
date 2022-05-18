package Recursion;

import java.util.*;
public class fibonacci {

    public static int fibo(int n)
    {
        if(n<0)
            return -1;
        if(n==0||n==1)
            return n;
        return fibo(n-1) + fibo(n-2);

    }

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter a no");
        int n=sc.nextInt();
        int product= fibo(n);
        System.out.println("The fibonacci is "+product);
        }
        finally{
            sc.close();
        }
       
    }
    
}
  