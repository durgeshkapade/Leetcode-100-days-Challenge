// 3-3-24
// 203. Remove Linked List Elements

// 1 . remove all first occurance of value
// 2 . check is element is val or not
// - if value then connect previous to next
// - if not move previous to next

package Day_23;

public class problem_203_Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {


        if(head == null){
            return head;
        }
        // remove all first occurance
        while(head!=null &&  head.val == val  ){
            head =  head.next;
        }
        ListNode slow = head;
        ListNode  fast  = head;

        while(fast!=null){
            if(fast.val == val){
                slow.next = fast.next;
            }else{
                slow = fast;
            }
            fast = fast.next;
        }
        
        return head;
    }
}