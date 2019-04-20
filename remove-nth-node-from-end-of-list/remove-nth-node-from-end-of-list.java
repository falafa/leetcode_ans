/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {//两遍扫描
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);//添加牵头节点 以防删除第一各元素
		dummy.next=head;
		int length=0;
		ListNode first=head;
		while(first!=null){
			length++;
			first=first.next;
		}
		length-=n;
		first=dummy;
		while(length>0){
			length--;
			first=first.next;
		}
		first.next=first.next.next;
		return dummy.next;
		
    }
}

class Solution {//双指针 一遍扫描
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
		dummy.next=head;
		ListNode first=dummy;
		ListNode second=dummy;
		
		for(int i=0;i<n+1;i++){
			second=second.next;
		}
		while(second!=null){
			second=second.next;
			first=first.next;	
		}
		first.next=first.next.next;
		return dummy.next;
    }
}