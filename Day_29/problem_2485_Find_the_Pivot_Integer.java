// 13-3-24
// 2485. Find the Pivot Integer

// Approach 1 :-  Based on Prefix Sum 
package Day_29;

public class problem_2485_Find_the_Pivot_Integer {
    public int pivotInteger(int n) {

        if(n==1)  return 1;
        int prefixSum[] = new int[n];
        prefixSum[0] = 1;
        
        for(int i=1;i<n;i++){
            prefixSum[i] = i+1 + prefixSum[i-1];
        }

        for(int i=1;i<n;i++){
            if(prefixSum[i]==(prefixSum[n-1]-prefixSum[i-1])){
                return i+1;
            }
        }

        return -1;
        
    }
}
