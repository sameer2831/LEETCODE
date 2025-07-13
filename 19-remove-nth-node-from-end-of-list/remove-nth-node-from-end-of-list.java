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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int listSize=0;
        ListNode curr=head;
        while(curr!=null)
        {
            listSize++;
            curr=curr.next;
        }
        int removeIndex=listSize-n;
        if(removeIndex==0) return head.next;
        curr=head;
        for(int i=0;i<removeIndex;i++)
        {
            if(i+1==removeIndex)
            {
                curr.next=curr.next.next;
                break;
            }
            curr=curr.next;
        }
        return head;
    }
}