/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
         if(head == null){
        return null;
    }

    Node temp = head;
    int cnt=0;
    while(temp!=null){
        cnt++;
        if(cnt==x) break;
        temp=temp.next;
    }

    if(temp == null) return head;

    Node back = temp.prev;
    Node front = temp.next;

    
    if(back == null && front == null){
        return null;
    }
    
    else if(back == null){
        head = front;        // move head to next node
        if(head != null) head.prev = null;
        return head;
    }
    
    else if(front == null){
        back.next = null;
        temp.prev = null;
        return head;
    }
    
    back.next = front;
    front.prev = back;

    return head;
    }
}