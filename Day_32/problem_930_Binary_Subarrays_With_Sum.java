// 3-4-24
// 930. Binary Subarrays With Sum

// read page no 4 for both problem
package Day_32;

import java.util.HashMap;
import java.util.Map;

public class problem_930_Binary_Subarrays_With_Sum {
    
    public int numSubarraysWithSum(int[] nums, int goal) {

        Map<Integer , Integer> mp = new HashMap(); 
        int n = nums.length;
        int preSum =0;
        int res = 0;
        mp.put(0,1);
        for(int i=0;i<n;i++){

            preSum += nums[i];
            res += mp.getOrDefault(preSum-goal , 0);
            mp.put(preSum , mp.getOrDefault(preSum , 0 )+1);

        }

        return res;
 
    }
}
