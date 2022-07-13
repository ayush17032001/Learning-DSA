package Collection_framework_practise;
import java.util.*;

public class LearnStack1{
    public static void main(String[] args) {
        //Stack works on LIFO
        Stack <String> abc=new Stack<>();
        abc.push("ayush");
        abc.push("dixit");
        abc.push("the");
        abc.push("great");
        System.out.println(abc);

        if(abc.isEmpty()){
            System.out.println("The stack is empty");
        }
        else{
            System.out.println("The stack is not empty");
        }
        abc.pop();
        System.out.println(abc);
    }
}
