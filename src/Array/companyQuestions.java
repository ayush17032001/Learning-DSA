package Array;

public class companyQuestions {

    public void twoSum(int[]num,int target){
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    System.out.println("["+i+" , "+j+"]");
                }
            }
        }
    }

    public int uniqueArray(int []array1){
        for(int i=0;i<array1.length-1;i++){
            for(int j=i+1;j<array1.length;j++){
                if(array1[i]==array1[j]){
                   return 1;
                }
            }
        } return 0;
        
    }

    public boolean isPermutation(int []array1, int []array2){
        int count=0;
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                    count++;
                    array2[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        } if(count==array1.length){
            return true;
        } else {
            return false;
        }
    }

    public int[][] rotate(int [][]array1){
        int [][]arrayTest= new int[array1.length][array1[0].length]; //Used another matrix here. If we can't use another matrix matrix then the soln will be different
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1[0].length;j++){
                arrayTest[j][2-i]=array1[i][j];
            }
        
        }
        return arrayTest;
    }

    public String bestScores(int []array1){
        int first=array1[0];
        int second=array1[0];

        for(int i=1;i<array1.length;i++){
            if(first<array1[i]){
                second =first;
                first=array1[i];
            }  
            else if(second<array1[i]){
                second =array1[i];
            }
        }    
        return first+" "+ second;
    }
    
}


    


