public class Solution {
    int flag=0;
    int val=0;
    public ListNode detectCycle(ListNode head) {
        if(head==null)
            return null;
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow=slow.next;
            
            fast=fast.next.next;
            if(slow==fast)
            {
                flag=1;
                break;
            }
            
        }
        slow=head;
        if(flag==1)
        {
            while(slow!=fast)
            {
                slow=slow.next;
                fast=fast.next;
            }
        
        return fast;}
        else
        return null;
            
        
    }
}