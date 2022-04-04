public class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;

        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }

        int x=k-1;
        while(x-->0){
            slow=slow.next;
        }

        int d=len-k;
        while(d-->0){
            fast=fast.next;
        }

        int t=slow.val;
        slow.val=fast.val;
        fast.val=t;

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
