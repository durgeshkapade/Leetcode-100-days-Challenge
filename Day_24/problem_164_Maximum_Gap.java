// 7-3-24
// 164. Maximum Gap

// sort the array and find the minimum distance between by subtracting the elements   
package Day_24;

import java.util.Arrays;

public class problem_164_Maximum_Gap {

    public int maximumGap(int[] nums) {

        Arrays.sort(nums);

        int dis = Integer.MIN_VALUE; 
        if(nums.length < 2){
            return 0;
        }
        int temp =  0;
        for(int i=1;i<nums.length;i++){
            temp = Math.abs( nums[i-1] - nums[i]);
            if(temp>dis){
                dis = temp;
            }
        }
        return dis;
    }

    
}