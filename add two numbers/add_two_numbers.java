public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode p1=l1,p2=l2,current=result;
        int carry=0;
		while(p1.next!=null||p2.next!=null){
			int a=(p1!=null)?p1.val:0;
			int b=(p2!=null)?p2.val:0;
			int sum=a+b+carry;
			carry=sum/10;
			current.next=new ListNode(sum%10);
			current=current.next;
			if (p1 != null) p1 = p1.next;
	        if (p2 != null) p2 = p2.next;
         }
		if(carry>0){
			current.next=new ListNode(carry);
		}
		return result.next;
    }