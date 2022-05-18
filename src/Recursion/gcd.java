package Recursion;

import java.util.*;
public class gcd {

    public static int hcf(int a, int b)
    {
        if (a<0||b<0)
            return -1;
        if(b==0)
            return a;  
        return hcf(b,a%b);
    }
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter 2 no");
        int n=sc.nextInt();
        int x=sc.nextInt();
        int product= hcf(n,x);
        System.out.println("The gcd is "+product);
        }
        finally{
            sc.close();
        }
       
    }
    
    
}
