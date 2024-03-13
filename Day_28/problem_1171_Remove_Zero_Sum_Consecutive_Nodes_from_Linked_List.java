// 12-3-24
// 1171. Remove Zero Sum Consecutive Nodes from Linked List
// https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/description/

// Approach 1 : - convert the Linked list into arraylist 
// 2 : - find the prefix sum for every new number if we found the zero sum it means that 
//   from left no    to   right no   ,, the sum of all element is zero 
// 3 : - pass the left and right index and change it value to any number(400000) like that
// 4 : - this process will continue until all elements are check
// 5: - at the last convert the arraylist into linked list and then return the head of new linked list
package Day_28;

import java.util.ArrayList;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}



public class problem_1171_Remove_Zero_Sum_Consecutive_Nodes_from_Linked_List {
    public ListNode removeZeroSumSublists(ListNode head) {

        ArrayList<Integer> a = new ArrayList<>();

        ListNode temp = head;
        while(temp!=null){
            a.add(temp.val);
            temp = temp.next;
        }

        int sum = 0; 
        for(int i=0;i<a.size();i++){
            for(int j=i;j<a.size();j++){
                sum = sum + a.get(j);
                if(sum == 0){
                    remove(a,i,j);
                    break;
                }
            }
            sum=0;
        }

        ListNode h = null;
        ListNode t = null;

        for (int i = 0; i < a.size(); i++) {
            int value = a.get(i);
            if (value <= 1000) { // Assuming you want to filter values less than or equal to 1000
                ListNode newNode = new ListNode(value);
                if (h == null) {
                    h = newNode;
                    t = newNode;
                } else {
                    t.next = newNode;
                    t = newNode;
                }
            }
        }
        return h;

    }

    public static void remove(ArrayList<Integer> a,int first,int second){
        for(int i=first;i<=second;i++){
            System.out.println(i);
            a.set(i, 5000);   // We set Value 5000 for check 
        }
    }
}
