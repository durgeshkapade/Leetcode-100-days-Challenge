// .  13-4-24      
//42. Trapping Rain Water
// use of two array 
// We make two array leftmax and rightmax , and we store in that array is ,
//  what is max 	at left side of that idx , and what is max at the right side of that idx.
// At last travel array , find the min compare with right and left  ,,, 
//  and substract the height of that building   ,  we get water contain by that building

package Day_36;

public class problem_42_Trapping_Rain_Water {
    
    class Solution {
        public int trap(int[] height) {
            
            int n = height.length;
            int []leftMax = new int[n];
            int []rightMax = new int[n];
    
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(height[i]>max)  max = height[i];
                leftMax[i] = max;
            }
            max = Integer.MIN_VALUE;
            for(int i=n-1;i>=0;i--){
                if(height[i]>max)  max = height[i];
                rightMax[i] = max;
            }
    
            int ans = 0;
            for(int i=0;i<n;i++){
                int min = Math.min(leftMax[i],rightMax[i]);
                int water = min - height[i];
                if(water>0)  ans+=water;
            }
            return ans;
    
        }
    }


}
