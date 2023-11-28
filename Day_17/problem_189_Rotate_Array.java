package Day_17;
//28-11-23
//189. Rotate Array

public class problem_189_Rotate_Array {

        public void rotate(int[] nums, int k) {
            
            int n = nums.length;
            // it means the if we rotate n times it exactly equl to previous
            // k > n   it means we cant roatate it , but if rotate by using find the reminder 
            // if k is small then no problem
            // but k is large then find reminder
            k = k%n;
    
            reverse(nums,0,n-k-1);
            reverse(nums,n-k,n-1);
            reverse(nums,0,n-1);
    
        }
    
        public static void reverse(int arr[],int i,int j){
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j--;
            }
    
        }
    
}
