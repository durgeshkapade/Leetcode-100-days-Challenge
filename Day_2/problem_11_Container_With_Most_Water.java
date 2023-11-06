
// this problem is solve using binary search

package Day_2;

class problem_11_Container_With_Most_Water {
    public int maxArea(int[] height) {
        
        int st = 0 ;
        int end = height.length-1;
        int max = Integer.MIN_VALUE;
        
        while(st<end){
            
            int small = Math.min(height[st],height[end]);
            
            int watercheck = (end-st)*small;
            
            if(watercheck>max){
                max = watercheck;
            }
            
            if(small==height[st])
                st=st+1;
            else
                end = end -1;
            
            
        }
        
        return max;
        
    }
}