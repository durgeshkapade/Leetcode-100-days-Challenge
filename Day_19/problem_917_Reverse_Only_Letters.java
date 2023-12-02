package Day_19;
// 1-12-23
//917. Reverse Only Letters


public class problem_917_Reverse_Only_Letters {
    
        public String reverseOnlyLetters(String s) {
    
            char arr[] = s.toCharArray();
            int i=0,j=s.length()-1;
            while(i<j){
                while(i<j && !Character.isAlphabetic(arr[i])){
                    i++;
                }
                while(i<j && !Character.isAlphabetic(arr[j])){
                    j--;
                }
    
                char t = arr[i];
                arr[i] = arr[j];
                arr[j] =  t;
                i++;
                j--;
            }
    
            return new String(arr);
            
        }
    
}
