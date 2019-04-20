/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 public class Solution {//使用set判断是否已经访问过该节点
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSeen=new HashSet<>();
		while(head!=null){
			if(nodeSeen.contains(heads)){
				return true;
			}else{
				nodeseen.add(head);
			}
			head=head.next;
		}
		return false;
    }
}

public class Solution{//双指针
	public boolean hasCycle(ListNode head){
		if(head==null||head.next==null){
			return false;
		}
		ListNode slow=head;
		ListNode fast=head.next;
		while(slow!=fast){
			if(fast==null||fast.next==null)return false;
			slow=slow.next;
			fast=fast.next.next;
		}
		return true;
	}
}
