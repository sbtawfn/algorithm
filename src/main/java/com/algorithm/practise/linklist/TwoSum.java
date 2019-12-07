package com.algorithm.practise.linklist;

/**
 * 两数相加.
 * https://leetcode-cn.com/problems/add-two-numbers/
 * @author lichangwei
 */
public class TwoSum {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp = new ListNode(0);
        ListNode nxt1 = l1;
        ListNode nxt2 = l2;
        ListNode cur = tmp;
        int carry = 0;
        while (nxt1 != null || nxt2 != null) {
            int x = (nxt1 != null) ? nxt1.val : 0;
            int y = (nxt2 != null) ? nxt2.val : 0;
            int sum = x + y + carry;
            int val = sum < 10 ? sum : sum % 10;
            cur.next = new ListNode(val);
            cur = cur.next;
            carry = sum / 10;

            if(nxt1 != null){nxt1 = nxt1.next;}
            if(nxt2 != null){nxt2 = nxt2.next;}
        }
        if (carry > 0) {
            cur.next = new ListNode(carry);
        }
        return tmp.next;
    }

    public static void main(String[] args) {
        //[2,4,3]
        //[5,6,4]
        //->[7,0,8]
        ListNode l1 = new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2= new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

        new TwoSum().addTwoNumbers(l1, l2);
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}