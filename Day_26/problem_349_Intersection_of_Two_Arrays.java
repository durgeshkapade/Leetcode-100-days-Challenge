// 10-3-24
// 349_Intersection_of_Two_Arrays

// Approach 1  : sort arrays both
// make to pointer i and j of both array 
// if we find similar then store it else
// if left is small then move the left  -- if right is small then move the right  
package Day_26;
import java.util.*;
public class problem_349_Intersection_of_Two_Arrays {
    
    public int[] intersection(int[] nums1, int[] nums2) {

        // 1 Approach
        ArrayList<Integer> l = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                int t = nums1[i];
                l.add(t);
                while(i<nums1.length && t==nums1[i]) i++;
                while(j<nums2.length && t==nums2[j]) j++;
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
