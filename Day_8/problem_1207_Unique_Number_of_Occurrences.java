// 14-11-23
// 1207. Unique Number of Occurrences
package Day_8;

public class problem_1207_Unique_Number_of_Occurrences {
    
    public boolean uniqueOccurrences(int[] arr) {
        
        // make frequency array 0 -2000  (for storing index of negative number)
        int fre[]=new int[2001];
        
        // [ -1000  - 0 ]    [ 1000 - 2000 ]
        for(int i=0;i<arr.length;i++){
            fre[1000+arr[i]]++;
        }
           
        // then sort frequency array by using bubble sort
        // it store like [ 0 0 0 0 0 0 0 0 0 0 1 3 4 5]
        for(int i=0;i<fre.length-1;i++){
            for(int j=i+1;j<fre.length;j++){
                if(fre[j]<fre[i]){
                    int temp = fre[i];
                    fre[i]=fre[j];
                    fre[j]=temp;
                }
            }
        }

        // if 0 is found then skip
        // if number is found it is equal to 1 or not 
        // [0 0 0 0 0 0 1 1 1 4 5]  if same no if found then there is not occurence of unique 
        int no=1;
        for(int i=0;i<fre.length;i++){
            if(fre[i]==0) continue;
            
            if(fre[i]==no || fre[i]!=fre[i-1]){
                no++;
            }else{
                return false;
            }
        }
        
        return true;
        
    }

}
