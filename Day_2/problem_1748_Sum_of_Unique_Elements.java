
// this problem is solve using making frequency array
package Day_2;

public class problem_1748_Sum_of_Unique_Elements {

    public int sumOfUnique(int[] arr) {
        
        
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int fre[] =  new int[max+1];
        
        for(int i=0;i<arr.length;i++){
            fre[arr[i]]++;
        }
        
        for(int i=0;i<fre.length;i++){
            if(fre[i]==1){
                sum=sum+i;
            }
        }
        
        return sum;
        
    
    }
}
