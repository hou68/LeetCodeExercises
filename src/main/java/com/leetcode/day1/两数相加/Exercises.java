package com.leetcode.day1.两数相加;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Exercises {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
   }

    public static void main(String[] args) {
        ListNode l1 =new ListNode(3);
        l1.next = new ListNode(7);
        l1.next.next = new ListNode(1);
        ListNode l2 =new ListNode(4);
        l2.next = new ListNode(8);
        l2.next.next = new ListNode(2);
        System.out.println(l1);
        addTwoNumbers(l1,l2);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode(0);
        ListNode model = res;
        while(l1 != null || l2 !=null){
            int x = 0,y=0;
            if(l1 != null){
                x = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                y = l2.val;
                l2 = l2.next;
            }
            int sum = x + y +carry;
            if(sum > 9){
                sum = sum-10;
                carry = 1;
            }else {
                carry = 0;
            }
            model.next = new ListNode(sum);
            model = model.next;
        }
        if(carry == 1){
            model.next = new ListNode(carry);
        }
        return res.next;
    }
}
