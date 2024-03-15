// 15-3-24
// problem_238._Product_of_Array_Except_Self


package Day_30;
public class problem_238_Product_of_Array_Except_Self{
    public int[] productExceptSelf(int[] nums) {

        int ans[] = new int[nums.length];
        int counter = 0;
        int mul = 1;


        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                counter++;
            }else{
                mul *= nums[i];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(counter==0)  ans[i] = mul/nums[i];
            else if(counter>1){
                ans[i] = 0;
            }else{
                if(nums[i]==0){
                    ans[i] = mul;
                }else{
                    ans[i] = 0;
                }
            }
        }

        return ans;
        
    }
}