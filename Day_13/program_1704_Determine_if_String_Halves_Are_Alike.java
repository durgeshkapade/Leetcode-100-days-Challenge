package Day_13;
// 23-11-23

public class program_1704_Determine_if_String_Halves_Are_Alike {

        public boolean halvesAreAlike(String s) {
            
            int n = s.length();
            int j=n/2;
            int count1=0,count2=0;
            
            for(int i=j;i<s.length();i++){
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
                  s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' ){
                    count1++;
                }
            }
            
            for(int i=0;i<j;i++){
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
                  s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' ){
                    count2++;
                }
            }
            
            if(count1==count2)
                return true;
            else
                return false;
            
            
        }
    

}
