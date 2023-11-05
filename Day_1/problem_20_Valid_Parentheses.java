// 5-11-23
// this problem is solve using stack 
// Input: s = "()[]{}"
// Output: true
// Input: s = "([]){(})"
// Output: false

import java.util.*;
class Solution {
    public boolean problem_20_Valid_Parentheses(String s) {
        
        Stack<Character> st = new Stack<>();
                                      
        int n = s.length();
        
                                      
        for(int i=0;i<n;i++){
            
            char ch = s.charAt(i);
            
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }else{
                
                if(st.size()==0)  return false;
                
                if(st.peek()=='(' && ch==')' || st.peek()=='[' && ch==']' || st.peek()=='{' && ch=='}' ){
                    st.pop();
                }else{
                    return false;
                }
                
                
            }
            
        }
                                      
        if(st.size()==0)  return true;
                                      
        return false;                                      
                                      
                                     
        
    }
}