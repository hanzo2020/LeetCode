package pers.cb;
//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
//如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/add-two-numbers
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class No2 {

}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 class ListNode {
    int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);//头
        ListNode temp = head;//辅助变量
        ListNode List1 = l1;//辅助变量
        ListNode List2 = l2;//辅助变量
        int carry = 0;//进位
        while(List1 != null || List2 != null){
        	int x,y;
        	if(List1 != null){
        		x = List1.val;
        	}else{
        		x = 0;
        	}
        	if(List2 != null){
        		y = List2.val;
        	}else{
        		y = 0;
        	}
        	int sum = x + y + carry;
        	carry = sum / 10;
        	temp.next = new ListNode(sum%10);
        	temp = temp.next;
        	if(List1 != null){
        		List1 = List1.next;
        	}
        	if(List2 != null){
        		List2 = List2.next;
        	}
        	
        }
        if(carry > 0){
        	temp.next = new ListNode(carry);
        }
        return head.next;
        
    }
}