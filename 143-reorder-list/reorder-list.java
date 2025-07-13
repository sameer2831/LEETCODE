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
    public void reorderList(ListNode head) {
        ListNode curr=head;
        List<ListNode> nodes=new ArrayList<>();
        while(curr!=null)
        {
            nodes.add(curr);
            curr=curr.next;
        }
        int left=0,right=nodes.size()-1;
        while(left<right)
        {
            nodes.get(left).next=nodes.get(right);
            left++;
            if(left>=right)
            {
                break;
            }
            nodes.get(right).next=nodes.get(left);
            right--;

        }
        nodes.get(left).next=null;
    }
}