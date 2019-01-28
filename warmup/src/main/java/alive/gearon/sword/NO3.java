package alive.gearon.sword;

import java.util.ArrayList;

public class NO3 {
	/**
	 * 
	 *	输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
	 *
	 */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	ArrayList<Integer> array = new ArrayList<Integer>();
    	ArrayList<Integer> another = new ArrayList<Integer>();
    	ListNode temp = listNode;
    	while(temp != null){
    		array.add(temp.val);
    		temp = temp.next;
    	}
    	for(int i = array.size() - 1; i > -1; i--){
    		another.add(array.get(i));
    	}
    	return another;
    }
    
   public class ListNode {
	   int val;
	   ListNode next = null;
   
	   ListNode(int val) {
		   this.val = val;
	   }
   }
}
