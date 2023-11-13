 // 13-11-23
// another method is by using cyclic sort

public class problem_268_Missing_Number{
    public int missingNumber(int[] arr) {

        int n=arr.length;

        // find total sum up to N
        int totalsum= n*(n+1)/2;
        int sum=0;
        
        // calculate sum of array
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        
        // return ( total sum -array sum )
        return totalsum-sum;
        
    }

}