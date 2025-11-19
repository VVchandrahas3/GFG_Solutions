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
    public int length(Node slow){
        Node fast1=slow;
        int count=1;
        while(fast1.next!=slow){
            fast1=fast1.next;
            count=count+1;
        }
        return count;
    }
    public int lengthOfLoop(Node head) {
        // code here
         Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return length(slow);
            }
        }
        return 0;
    }
}