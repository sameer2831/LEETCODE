/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node curr=head;
        List<Node> copyNodes=new ArrayList();
        List<Node> nodes=new ArrayList();

        while(curr!=null)
        {
            int value=curr.val;
            Node newNode=new Node(value);
            nodes.add(curr);
            copyNodes.add(newNode);
            curr=curr.next;
        }
        int randomIndexes[]=new int[nodes.size()];
        for(int i=0;i<nodes.size();i++)
        {
            Node search=nodes.get(i).random;
            if(search==null) randomIndexes[i]=-1;
            else randomIndexes[i]=nodes.indexOf(search);
        }
        if(randomIndexes[0]==-1) copyNodes.get(0).random=null;
        else copyNodes.get(0).random=copyNodes.get(randomIndexes[0]);
        for(int i=1;i<copyNodes.size();i++)
        {
            copyNodes.get(i-1).next=copyNodes.get(i);
            if(randomIndexes[i]==-1) copyNodes.get(i).random=null;
            else copyNodes.get(i).random=copyNodes.get(randomIndexes[i]);
        }
        return copyNodes.get(0);

    }
}