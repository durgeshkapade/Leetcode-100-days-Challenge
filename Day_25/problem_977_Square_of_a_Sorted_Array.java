// 9-3-24
// 977. Squares of a Sorted Array

// Approach 1  : Square each term and then sort then return
// Approach 2 : make new array , use two pointer first and last 
// square of this two  pointer if left is greater then move the left in new array at last
// if right is greater then move the right in new array 


package Day_25;

public class problem_977_Square_of_a_Sorted_Array {


        public int[] sortedSquares(int[] arr) {
            int[] res = new int[arr.length];
            int start=0,end=arr.length-1;
            int idx=end;
            while(start<=end){
                int left = arr[start]*arr[start];
                int right = arr[end]*arr[end];
                if(left>right){
                    res[idx]=left;
                    start++;
                }
                else {
                    res[idx]=right;
                    end--;
                }
                idx--;
            }
            return res;
        }

    
}
