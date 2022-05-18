package Recursion;
import java.util.*;
public class sumofdigits {

    public static int sum_digits(int n)
    {
        if (n<0)
            return -1;
        if (n<10)
            return n;
        return sum_digits(n/10)+n%10;
    }
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter a no");
        int n=sc.nextInt();
        int sum= sum_digits(n);
        System.out.println("The sum of digits is "+sum);
        }
        finally{
            sc.close();
        }
       
    }
    
}
