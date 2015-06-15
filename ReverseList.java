/*
面试题16：反转链表
*/
class ListNode{
    int value;
    ListNode next;
}

public class ReverseList{
    public ListNode reverseList(ListNode head){
        ListNode reverseHead = null;
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null){
            ListNode next = cur.next;
            if(next == null)
                reverseHead = cur;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return reverseHead;
    }
} 