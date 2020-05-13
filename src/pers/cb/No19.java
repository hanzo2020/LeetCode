package pers.cb;
/*
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 */

public class No19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No19 ni = new No19();
		ListNode list1 = new ListNode(1);
		ListNode list2 = new ListNode(2);
		ListNode list3 = new ListNode(3);
		ListNode list4 = new ListNode(4);
		ListNode list5 = new ListNode(5);
		list1.next = list2;
		list2.next = list3;
		list3.next = list4;
		list4.next = list5;
		ListNode head = ni.removeNthFromEnd(list1, 2);
		ListNode temp = list1;
		while(temp != null){
			System.out.println(temp.val);
			temp = temp.next;
		}
		
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode left = temp;
		ListNode right = temp;
		for (int i = 0; i < n; i++) {
			right = right.next;
		}
		while(right != null && right.next != null){
			right = right.next;
			left = left.next;
		}
		left.next = left.next.next;
		return temp.next;
    }

}
