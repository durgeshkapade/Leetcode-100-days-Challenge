// .  6-4-24      
//1249. Minimum Remove to Make Valid Parentheses
// use of stack and set 

package Day_35;

import java.util.*;

public class problem_1249_Minimum_Remove_to_Make_Valid_Parentheses {
    public String minRemoveToMakeValid(String s) {
        
        Stack<Integer> st = new Stack<>();
        Set<Integer> set = new HashSet<>();
        int n = s.length();

        for(int i=0;i<n;i++){

            if(s.charAt(i)=='(' ){
                st.push(i);
            }else if(s.charAt(i)==')'){
                if(st.isEmpty()){
                    set.add(i);
                }else{
                    st.pop();
                }                  
            }
        } 

        // stack contains only ((((     there is no such ))))  ...   that time we remove  ((((
        while(!st.isEmpty()){
            set.add(st.peek());
            st.pop();
        }

        String res = "";
        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                res += s.charAt(i);
            }
        }
     
        return res;
    }
}
