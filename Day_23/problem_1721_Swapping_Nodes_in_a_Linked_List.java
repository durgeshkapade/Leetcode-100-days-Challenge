// 3-3-24
// 1721. Swapping Nodes in a Linked List

// make three pointer two pointer is check first elemnt by travel k-1 times
// and next two pointer is check second element

package Day_23;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}

public class problem_1721_Swapping_Nodes_in_a_Linked_List {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode start = head;
        ListNode end = head;
        ListNode temp = head;

        for(int i=1;i<=k-1;i++){
            start = start.next;
            temp = temp.next;
        }

        while(temp.next!=null){
            temp = temp.next;
            end = end.next;
        }
        int t = start.val;
        start.val = end.val;
        end.val = t;

        return head;
        
    }
}