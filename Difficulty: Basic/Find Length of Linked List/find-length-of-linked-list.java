/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        // code here
        Node cur=head;
        int cnt=0;
        while(cur!=null){
             cnt++;
            cur=cur.next;
        }
        return cnt;
    }
}