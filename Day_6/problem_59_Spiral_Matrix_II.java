// 12-11-23
// Spiral matrix II 

package Day_6;

public class problem_59_Spiral_Matrix_II{

    public int[][] generateMatrix(int n) {
        
        int no=1;
        int toprow=0,leftcol=0;
        int bottomrow=n-1,rightcol=n-1;
        int arr[][]=new int[n][n];
        
        while(no<=n*n){
            //  toprow  =  leftcol -> rightcol
            for(int j=leftcol; j<=rightcol &&no<=n*n ;j++ ){
                arr[toprow][j]=no++;
            }
            toprow++;
            // rightcol = toprow -> bottomrow
            for(int i=toprow ; i<=bottomrow &&no<=n*n ;i++){
                arr[i][rightcol]=no++;
            }
            rightcol--;
            // bottomrow = rightcol -> leftcol
            for(int j=rightcol;j>=leftcol &&no<=n*n ;j--){
                arr[bottomrow][j]=no++;
            }
            bottomrow--;
            // leftcol = bottomrow -> toprow
            for(int i=bottomrow;i>=toprow &&no<=n*n ;i--){
                arr[i][leftcol]=no++;
            }
            leftcol++;
            
        }
        
        return arr;
        
    }

    
}