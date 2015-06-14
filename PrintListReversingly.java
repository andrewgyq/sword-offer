/*
面试题5：从尾到头打印链表
输入一个链表的头结点，从尾到头反过来打印每个结点的值。
*/
import java.util.Stack;
class ListNode{
	int key;
	ListNode next;
	ListNode(int key){
		this.key = key;
		this.next = null;
	}
}

public class PrintListReversingly{

	public void iteratively(ListNode head){
		Stack<ListNode> stack = new Stack<ListNode>();
		ListNode cur = head;
		while(cur != null){
			stack.push(cur);
			cur = cur.next;
		}

		while(!stack.empty()){
			cur = stack.pop();
			System.out.print(cur.key + " ");
		}
	}

	public void recursively(ListNode head){
		if(head != null){
			if(head.next != null){
				recursively(head.next);
			}
			System.out.print(head.key + " ");
		}
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);

		node1.next = node2;
		node2.next = node3;

		PrintListReversingly plr = new PrintListReversingly();
		plr.iteratively(node1);
		System.out.println();
		plr.recursively(node1);

	}
}