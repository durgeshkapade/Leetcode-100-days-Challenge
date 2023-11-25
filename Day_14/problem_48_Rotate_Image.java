// 25-11-23
// tc - 0 ms
package Day_14;

public class problem_48_Rotate_Image {

        public void Transpose(int a[][],int r,int c){
            for(int i=0;i<c;i++){
                for(int j=i;j<r;j++){
                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            }      
            
        }
        public void swap(int a[]){
            int i=0,j=a.length-1;
            while(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
    
        public void Rotate(int a[][],int n){
            Transpose(a,n,n);
    
            for(int i=0;i<a.length;i++){
                swap(a[i]);
            }
        }
    
    
        public void rotate(int[][] a) {
            
            int r=a.length;      
            Rotate(a,r);
        }
    
}
