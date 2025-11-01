/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // code here
          Node P=new Node(val);
        if(pos==1){
                P.next=head;
                return P;
        }
        
        Node temp=head;
        Node prev=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            if(cnt==pos){
                Node dup=prev.next;
                prev.next=P;
                P.next=dup;
                return head;
            }
            prev=temp;
            temp=temp.next;
        }
        Node temp1 = head;
        while (temp1.next != null) {
            temp1 = temp1.next;
        }
        temp1.next = P;
        return head;
    }
}