// 7-11-23
package Day_3;

class problem_28_Find_the_Index_of_the_First_Occurrence_in_a_String {

    public int strStr(String haystack, String needle) {
        int haylength=haystack.length();
        int needlelength=needle.length();
        
        // if haystack size is less than the needle size it means the needle is not present in the heystack       
        if(haylength<needlelength)
            return -1;
        
        // in loop i will substracted the length of needle because at the end the needle having the 
        // larger size than the haystack        
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            
            // i will check every character up to needle length 
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    
    }
     
}