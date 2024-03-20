// 20-3-24
// 56. Merge Intervals

package Day_31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem_56_Merge_Intervals {

    public int[][] merge(int[][] intervals) {


        List<int[]> ans = new ArrayList<>();
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int n = intervals.length;

        ans.add(new int[]{intervals[0][0], intervals[0][1]});

        for(int i=1;i<n;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(!ans.isEmpty() && start<=ans.get(ans.size()-1)[1]){
                ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1],end);
            }else{
                ans.add(new int[]{start, end});
            }
            
            
            // ans.add(new int[]{start, end});

        }

        return ans.toArray(new int[ans.size()][]);

        // solution 2--------------------------------   ------------------------------

        // List<int[]> ans = new ArrayList<>();

        // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // int n = intervals.length;
        // // int k=0;
        // for(int i=0;i<n;i++){
        //     int start = intervals[i][0];
        //     int end = intervals[i][1];

        //     if(!ans.isEmpty()  && end <= ans.get(ans.size() - 1)[1]){
        //         continue;
        //     }
        //     for(int j=i+1;j<n;j++){
        //         if(intervals[j][0] <= end){
        //             end = Math.max(end,intervals[j][1]);
        //         }else{
        //             break;
        //         }
        //     }
            
        //     ans.add(new int[]{start, end});

        // }

        // return ans.toArray(new int[ans.size()][]);

    }


}