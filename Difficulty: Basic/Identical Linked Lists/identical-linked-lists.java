/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        // code here
        int cnt1=0;
        Node curr1=head1;
        while(curr1!=null){
            cnt1++;
            curr1=curr1.next;
        }
        int cnt2=0;
        Node curr2=head2;
        while(curr2!=null){
            cnt2++;
            curr2=curr2.next;
        }
        curr1=head1;
        curr2=head2;
        if(cnt1==cnt2){
            while(curr1!=null && curr2!=null){
                if(curr1.data!=curr2.data){
                    return false;
                }
                curr1=curr1.next;
                curr2=curr2.next;
            }
        }
        else{
            return false;
        }
        return true;
    }
}