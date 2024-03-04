// 4-3-24
// 948. Bag of Tokens
// Use two pointer Approach And Greedy Algorithm
package Day_22;
import java.util.Arrays;


public class problem_948_Bag_of_Tokens {
    public int bagOfTokensScore(int[] tokens, int power) {

        // Youtube Solution

        int score =0 , maxScore = 0 ;
        int start = 0 ,end = tokens.length-1;
        Arrays.sort(tokens);

        while(start<=end ){
            if(power >= tokens[start]){
                power-= tokens[start++];
                maxScore = Math.max(++score,maxScore);
            }else if(score>0){
                power += tokens[end--];
                score--;
            }else{
                break;
            }
        }
        return maxScore;



        // my Solution

        // int score =0 ;
        // int start = 0 ,end = tokens.length-1;
        // Arrays.sort(tokens);

        // while(start<=end ){

        //     if(power >= tokens[start]){
        //         score++;
        //         power-= tokens[start++];
        //     }else if(start<end && power < tokens[start] && score>0){
        //         power += tokens[end--];
        //         score--;
        //     }else if(power < tokens[start] && score==0){
        //         return 0;
        //     }else{
        //         start++;
        //     }

        // }
        // return score;
        
    }
}