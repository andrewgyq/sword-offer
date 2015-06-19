/*
面试题37：两个链表的第一个公共结点
*/

class ListNode{
    int key;
    ListNode next;
    ListNode(int key){
        this.key = key;
        this.next = null;
    }
}

public class FirstCommonNodeInLists{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Boolean> map = new HashMap<ListNode,Boolean>();
        while(headA != null){
            map.put(headA, true);
            headA = headA.next;
        }
        while(headB != null){
            if(map.get(headB) != null && map.get(headB)){
                break;
            }
            headB = headB.next;
        }
        return headB;
    }
}