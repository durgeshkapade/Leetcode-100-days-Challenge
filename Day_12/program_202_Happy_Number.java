// 20-11-23
// 202
package Day_12;

public class program_202_Happy_Number {
    
        public boolean isHappy(int n) {
            int slowsum=n;
            int fastsum=n;
            
            //while loop is not used here because initially slow and 
            //fast pointer will be equal only, so the loop won't run.
            
          do{
            //slow moving one step ahead and fast moving two steps ahead
              
                slowsum = findsum(slowsum);
                fastsum = findsum(findsum(fastsum));
                
            //if a cycle exists, then the number is not a happy number
            //and slow will have a value other than 1
              
                if(fastsum==1 || slowsum==1 )
                    return true;
               
            }while(slowsum!=fastsum);
            
            
            return false;
       
        }
        
        public static int findsum(int n){
            int sum=0,rem=0;
            while(n!=0){
                rem=n%10;
                sum+=rem*rem;
                n/=10;
            }
            
            return sum;
        }
        
        
    
}
