/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(head==null) return head;
       if(x==1){
           head=head.next;
           return head;
       }
       int cnt=0;
       Node prev=null,temp=head;
       while(temp!=null){
           cnt++;
           if(cnt==x){
               prev.next=prev.next.next;
               break;
           }
           prev=temp;
           temp=temp.next;
       }
       return head;
       /*
       Another Way
        int cnt=0;
       Node temp=head;
       while(temp!=null){
           cnt++;
           if(cnt==x-1){
               temp.next=temp.next.next;
              
           }
           temp=temp.next;
       }
       return head;
       */
    }
}