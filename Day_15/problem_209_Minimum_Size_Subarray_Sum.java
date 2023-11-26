package Day_15;
//26-11-23
// Concept : -  Sliding Window

public class problem_209_Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] arr) {
        
        int i=0,j=-1;
        int sum=0;
        int length=Integer.MAX_VALUE;
        
        // travel until j cross the length (beoz we find the sum of subarray )
        
        // if sum is not found (sum<target) then j++
        // if sum is found (then calculate the length ) and increse the i++  (up to min length)
        
        while(j<=arr.length-1){
            
            if(sum<target){
                j++;
                if(j<arr.length){
                  sum=sum+arr[j];  
                }                
            }else{
                // there is hidden condition i.e if(sum>=target)   which is always true when upper if is false
                
                if((j-i+1)<length)
                    length=(j-i+1);                    
                sum=sum-arr[i];
                i++;                
            }
            
        }
        
        if(length==Integer.MAX_VALUE)
            return 0;
        else
            return length;
        
        
    }


}
