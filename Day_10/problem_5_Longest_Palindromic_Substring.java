
// 17-11-23
package Day_10;

public class problem_5_Longest_Palindromic_Substring {


            public String palindrome(String str){
                int i=0;
                int j=str.length()-1;
               
                while(i<j){
                    if(str.charAt(i)!=str.charAt(j)){
                        return "";
                    }
                    i++;
                    j--;
                }
        
                return str;
        
            }
        
            public String longestPalindrome(String s) {
                String ans="";
        
                for(int i=0;i<s.length();i++){
                    for(int j=i+1;j<s.length()+1;j++){
                        String z=s.substring(i,j);
                        if(ans.length()>z.length()){
                            continue;
                        }
                        String p=palindrome(z);
                        if(p.length()>ans.length()){
                            ans=p;
                        }
                    }
                }
        
                return ans;
            }
        
    
}
// 17-11-23
// package DAy_10;

// public class problem_5_Longest_Palindromic_Substring {


//             public String palindrome(String str){
//                 int i=0;
//                 int j=str.length()-1;
               
//                 while(i<j){
//                     if(str.charAt(i)!=str.charAt(j)){
//                         return "";
//                     }
//                     i++;
//                     j--;
//                 }
        
//                 return str;
        
//             }
        
//             public String longestPalindrome(String s) {
//                 String ans="";
        
//                 for(int i=0;i<s.length();i++){
//                     for(int j=i+1;j<s.length()+1;j++){
//                         String z=s.substring(i,j);
//                         if(ans.length()>z.length()){
//                             continue;
//                         }
//                         String p=palindrome(z);
//                         if(p.length()>ans.length()){
//                             ans=p;
//                         }
//                     }
//                 }
        
//                 return ans;
//             }
        
    
// }
