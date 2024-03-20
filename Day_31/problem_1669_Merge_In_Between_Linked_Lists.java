// 20-3-24
// 1669. Merge In Between Linked Lists

package Day_31;

import Day_28.ListNode;

public class problem_1669_Merge_In_Between_Linked_Lists {

    
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode start = list1;
        ListNode end = list1;

        for(int i=1;i<=b+1;i++){
            if(i<=a-1){
                start = start.next;
            }
            end= end.next;
        }

        start.next = list2;
        while(list2.next!=null){
            list2 = list2.next;
        }
        list2.next = end;

        return list1;
    }
}
