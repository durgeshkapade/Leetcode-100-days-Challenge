package Day_16;
// 27-11-23
// 2947. Count Beautiful Substrings I

import java.util.HashSet;
import java.util.Set;

public class problem_2947_Count_Beautiful_Substrings_I {
    

    public int beautifulSubstrings(String s, int k) {

        char[] cc = {'a', 'e', 'i', 'o', 'u'};
        Set<Character> vowelSet = new HashSet<>();
        for (char c : cc)
            vowelSet.add(c);
        
        int v=0,c=0,count=0;

        for(int i=0;i<s.length();i++){
            v=0 ;c=0;
            for(int j=i;j<s.length();++j){

                if(vowelSet.contains(s.charAt(j))){
                    v++;
                }else{
                    c++;
                }

                if((v==c) && (v*c)%k==0){
                    count++;
                }
               
            }

        }

        return count;

    }

}
