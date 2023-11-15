// 15-11-23
package Day_9;

public class problem_16_3Sum_Closest {

        public int threeSumClosest(int[] nums, int target) {
            
            int p=0;
            int ans=0;
            int max=Integer.MAX_VALUE;
           
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    for(int k=j+1;k<nums.length;k++){
    
                        p=nums[i]+nums[j]+nums[k];
    
                        int dist = Math.abs(p-target);// find the distance beth target and new number  
    
                        if(dist<max){
                            max = dist;
                            ans = p;
                        }
                        
    
                    }
                 }
            }
    
            return ans;
        }

    
}
