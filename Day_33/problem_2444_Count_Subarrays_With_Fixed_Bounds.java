// .  4-4-24      
//2444. Count Subarrays With Fixed Bounds @ IMP
// 	Use sliding Window to solve problem
// By using the   BadIndex   , MinIndex , MaxIndex    … By using some condition solve the problem

package Day_33;

public class problem_2444_Count_Subarrays_With_Fixed_Bounds {

    public long countSubarrays(int[] nums, int minK, int maxK) {
        
        int maxIdx = -1, minIdx = -1, badIdx = -1;
        long res=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK){
                badIdx = i;
            }

            if(nums[i]==minK){
                minIdx = i;
            }
            if(nums[i]==maxK){
                maxIdx = i;
            }

            int temp = Math.min(minIdx,maxIdx) - badIdx;
            res += Math.max(0,temp);

        }
        return res;
    }

}

