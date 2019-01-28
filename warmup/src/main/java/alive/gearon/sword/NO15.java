package alive.gearon.sword;

import alive.gearon.sword.NO3.ListNode;

/**
 * 
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 */
public class NO15 {
    public ListNode FindKthToTail(ListNode head,int k) {
    	if(head == null)
    		return null;
    	int length = 1;
    	ListNode node = head;
    	while(node.next != null) {
    		node = node.next;
    		length++;
    	}
    	int index = length - k + 1;
    	ListNode res = head;
    	while(index > 1) {
    		res = res.next;
    		index--;
    	}
    	return res;
    }
}
