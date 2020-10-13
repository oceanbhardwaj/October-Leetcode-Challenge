/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ArrayList<Integer> a=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null)
        {
            a.add(curr.val);
            curr=curr.next;
        }
        ListNode head1=new ListNode();
        ListNode curr1=head1;
        Collections.sort(a);
        for(int i:a)
        {
            head1.next=new ListNode(i);
            head1=head1.next;
        }
        return curr1.next;
    }
}*/




//second method --------------------------------------------)(nlogn) and o(1) space.

class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(slow);
        return merge(left,right);
        
    }
    private ListNode merge(ListNode l1,ListNode l2)
    {
    ListNode ans=new ListNode();
        ListNode curr=ans;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                curr.next=l1;
                l1=l1.next;
            }
            else
            {
                curr.next=l2;
                l2=l2.next;
            }
            
          curr=curr.next;  
            
            
            
            
            
        }
        if(l1!=null)
        {
            curr.next=l1;
            //l1=l1.next;
        }
        
        if(l2!=null)
        {
            curr.next=l2;
            //l2=l2.next;
        }
        
        
        return ans.next;
        
        
        
        
        
        
        
        
        
        
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
}







