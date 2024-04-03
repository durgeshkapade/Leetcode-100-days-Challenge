package Day_32;

import java.util.HashMap;
import java.util.Map;

public class problem560_Sum_array_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {

        Map<Integer , Integer>  mp = new HashMap<>();
        mp.put(0,1);
        int preSum =0 ;
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){

            preSum += nums[i];

            int remove = preSum-k;
    
    // if remove is exit then add the value of that  remove   (if not then add the 0)
            count += mp.getOrDefault(remove, 0);

            mp.put(preSum, mp.getOrDefault(preSum, 0) + 1);
        }
        return count;
        
    }
}
