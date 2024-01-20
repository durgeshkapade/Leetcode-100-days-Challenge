package Day_20;

import java.util.LinkedList;
import java.util.Queue;

public class problem_225_Implement_Stack_using_Queues {
    

    class MyStack {
        Queue<Integer> q = new LinkedList<>();

        public MyStack() {
            
        }
        
        public void push(int x) {
            q.add(x);
            for(int i=1;i<=q.size()-1;i++){
                q.add(q.remove());
            }
        }
        
        public int pop() {
            return q.remove();
        }
        
        public int top() { //peek
            return q.peek();
        }
        
        public boolean empty() {
            if(q.size()==0)  return true;
            return false;
            
        }
    }


}





// class MyStack {
//     Queue<Integer> q = new LinkedList<>();

//     public MyStack() {
        
//     }
    
//     public void push(int x) {
//         q.add(x);
//     }
    
//     public int pop() {
//         for(int i=1;i<=q.size()-1;i++){
//             q.add(q.remove());
//         }
//         return q.remove();
//     }
    
//     public int top() { //peek
//         for(int i=1;i<=q.size()-1;i++){
//             q.add(q.remove());
//         }
//         int x = q.peek();
//         q.add(q.remove());
//         return x;
//     }
    
//     public boolean empty() {
//         if(q.size()==0)  return true;
//         return false;
        
//     }
// }


