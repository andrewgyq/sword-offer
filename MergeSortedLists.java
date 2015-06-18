/*
面试题17：合并两个排序的链表
*/
class ListNode{
    int value;
    ListNode next;
}

public class MergeSortedLists{
    public ListNode merge(ListNode head1, ListNode head2){
        if(head1 == null)    
            return head2;
        if(head2 == null)
            return head1;

        ListNode mergedHead = null;
        if(head1.value < head2.value){
            mergedHead = head1;
            mergedHead.next = merge(head1.next, head2);
        }else{
            mergedHead = head2;
            mergedHead.next = merge(head1, head2.next);
        }
        return mergedHead;
    } 
}