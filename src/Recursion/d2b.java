package Recursion;

import java.util.*
;public class d2b {
    public static int d2b2(int n)
    { 
        if(n<0)
            return -1;
        if(n==0)
            return 0;
        return n%2+ 10*d2b2(n/2);


    }
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter a no");
        int n=sc.nextInt();
        int product= d2b2(n);
        System.out.println("The binary is "+product);
        }
        finally{
            sc.close();
        }
       
    }
    
    
}
