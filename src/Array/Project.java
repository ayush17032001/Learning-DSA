package Array;
import java.util.*;

public class Project {
    
    public void project()
    {   float temperature[]=null;
        Scanner sc=new Scanner(System.in);
        try{
            float total=0;
            System.out.println("Enter no. of days");
            int days=sc.nextInt();
            temperature=new float[days];
            for(int i=0;i<days;i++)
            {
                System.out.println("Enter the temperature on day"+ (i+1));
                temperature[i]=sc.nextFloat();
                total+=temperature[i];
            }
            float average = total/days;
            System.out.println("the average temperature is "+ average);
            int aboveAvgDays=0;
            for(int i=0;i<days;i++){
                if(temperature[i]>average){
                    aboveAvgDays+=1;
                }
            }
            System.out.println("total no. of days above average temperature is "+ aboveAvgDays);
        }
        finally{
            sc.close();
        }
    }

       
    }
    

