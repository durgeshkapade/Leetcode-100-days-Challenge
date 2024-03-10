// 9-3-24
// 350_Intersection_of_Two_Arrays II
// Similar to First Question
package Day_26;

import java.util.ArrayList;
import java.util.Arrays;

public class problem_350_Intersection_of_Two_Arrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        // 1 Approach
        ArrayList<Integer> l = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                int t = nums1[i];
                l.add(t);
                i++;j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }

        }
        int n = l.size();
        int[] ans = new int[n];
        for(int k=0; k<n; k++) {
            ans[k] = l.get(k);
        }

        return ans;

    }
}
