// 9-3-24
// 2540. Minimum Common Value


package Day_25;

public class problem_2540_Minimum_Common_Value {

    public int getCommon(int[] nums1, int[] nums2) {
        
        int i=0,j=0;
        int l1 = nums1.length , l2 = nums2.length;
        if(nums1[l1-1]<nums2[0]  || nums2[l2-1]<nums1[0])
            return -1;

            
        while(i<l1 && j<l2){
            if(nums1[i]==nums2[j])  return nums1[i];
            if(nums1[i]<nums2[j])  i++;
            else j++;
        }

        return -1;
    }

}
