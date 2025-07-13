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
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode curr=head;
        Set<ListNode> nodeSet=new HashSet<>();
        while(curr!=null)
        {
            nodeSet.add(curr);
            if(nodeSet.contains(curr.next)) return true;
            curr=curr.next;
        }
        return false;
        
    }
}