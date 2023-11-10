// 10-11-23
// Use Cyclic sort 
package Day_5;
import java.util.ArrayList;
import java.util.List;

public class problem_448_Find_All_Numbers_Disappeared_in_an_Array {

    public List<Integer> findDisappearedNumbers(int[] arr) {
        
        ArrayList<Integer> l= new ArrayList<>();
        int i=0;
        
        // sort by using cyclic sort
        while(i<arr.length){
            int correct = arr[i]-1;
            
            if(correct != i){               
                if(arr[i]==arr[correct]){
                    i++;
                    continue;
                }              
                int temp = arr[i];
                arr[i]= arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
            
        }
        
        //After sorting check current element is equal to i+1 or not 
        // if not this i+1 is missing
        for(i =0;i<arr.length;i++){
            if(arr[i] != i+1){
                l.add(i+1);
            }
        }
        
        return l;
        
    }

}
