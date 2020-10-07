class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)
            return head;
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=head;
        int count=0;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        curr=head;
        
        if(k%count==0)
            return head;
        if(k>count)
            k=k%count;
        
        int d=count-k;
        while(d>0)
        {
            prev=curr;
            curr=curr.next;
            d--;
        }
        prev.next=null;
        ListNode curr1=curr;
        while(curr.next!=null)
            curr=curr.next;
        curr.next=head;
        return curr1;
        
        
            
            
        
    }
}