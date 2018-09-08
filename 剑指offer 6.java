//stack
/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Stack<Integer> s=new Stack<Integer>();
        ListNode Node = listNode;
        while(Node != null){
            s.push(Node.val);
            Node = Node.next;
        }
        while (!s.isEmpty()){
            list.add(s.pop());
        }
        return list;
    }
}

//递归
/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        ListNode Node = listNode;
        if (Node!=null){
            if (Node.next != null){
                list = printListFromTailToHead(Node.next);
            }                
            list.add(Node.val);
        }
        return list;
    }
}
