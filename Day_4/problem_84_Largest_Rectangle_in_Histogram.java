// 9-11-23
//84. Largest Rectangle in Histogram  
package Day_4;

import java.util.Stack;

public class problem_84_Largest_Rectangle_in_Histogram {

    public int largestRectangleArea(int[] height) {
        int n = height.length;
        int nse[]= new int[n];
        int pse[]= new int[n];
        
        Stack<Integer> st = new Stack<>();
        
// calculating next smaller element
        st.push(n-1);
        nse[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(st.size()!=0 && height[st.peek()]>=height[i]){
                st.pop();
            }
            
            if(st.size()==0){
                nse[i]=n;
            }else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
        
 // clear stack
        st.clear();
        
// calculate previous smaller element
        
        st.push(0);
        pse[0]=-1;
        for(int i=1;i<n;i++){
            while(st.size()!=0 && height[st.peek()]>=height[i]){
                st.pop();
            }
            
            if(st.size()==0){
                pse[i]=-1;
            }else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int area = height[i]*(nse[i]-pse[i]-1);
            max = Math.max(area,max);
        }
        
        return max;
        
    }

    
}
