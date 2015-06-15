/*
面试题15：链表中倒数第k个结点
*/
class ListNode{
    int value;
    ListNode next;
}

public class KthNodeFromEnd{
    public ListNode kthNodeFromEnd(ListNode head, int k){
        if(head == null || k == 0)
            return null;
        ListNode ahead = head;
        ListNode behind = head;
        for(int i = 0; i < k - 1; i++){
            if(ahead.next != null)
                ahead = ahead.next;
            else
                return null;
        }
        while(ahead.next != null){
            ahead = ahead.next;
            behind = behind.next;
        }
        return behind;
    }
}