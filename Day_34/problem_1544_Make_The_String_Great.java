// .  5-4-24      
//1544. Make The String Great

package Day_34;
public class problem_1544_Make_The_String_Great{
    public String makeGood(String s) {

        String ans = "";
        int anspointer = -1;
        boolean check = false;
        int n = s.length();
        if(n==0 || n==1) return s;

        while(s.length()!=0){
            check = false;
            ans="";
            for(int i=0;i<s.length();i++){
                if(ans.length()==0){
                    ans += s.charAt(i);
                    anspointer++;
                }else if(Math.abs(s.charAt(i)-ans.charAt(anspointer))==32){
                    ans = ans.substring(0,ans.length()-1);
                    anspointer--;
                }else{
                    ans += s.charAt(i);
                    anspointer++;
                }
                
            }

            s = ans;
            if(check==false){
                break;
            }
   
        }

        return s;               


        
    }
}