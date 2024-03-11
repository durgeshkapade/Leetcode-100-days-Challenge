// 11-3-24
// 791. Custom Sort String
// https://youtu.be/eAU3snVZs5Q?si=C0s9WpFv6HStkT-z

// Approach 1  : make freq array ,,  i will store all the frequency of s String 
// 2 : travel on the order String of character ,, if they present in the freq array 
//  i will store the that character in ans String 
// after completing all the characters of order String 
// i will check freq  array ,, those characters are remaining in the freq array i will store it in the ans String

package Day_27;

public class problem_791_Custom_Sort_String {
    public String customSortString(String order, String s) {
        
        int fre[] = new int[26];
        String ans = "";
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i) - 'a';
            fre[idx]++;
        }

        for(int i=0;i<order.length();i++){
            int idx = order.charAt(i)  - 'a';
            while(fre[idx]>0){
                ans+= order.charAt(i);
                fre[idx]--;
            }
        }

        for(int i=0;i<26;i++){
            while(fre[i]>0){
                int no = i+97;
                ans+= (char) no;
                fre[i]--;
            }
        }

        return ans;

    }
}
