package com.hotmail.huzy8080.library_hu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public static void main(String[] args) {
        Solution2 solution2=new Solution2();
        ListNode node = solution2.IntegerToListNode(9999999991L);
        ListNode node1 = solution2.IntegerToListNode(9L);
        ListNode node2 = solution2.addTwoNumbers(node1, node);
        System.out.println("ok");
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Long sum = listNodeToInteger(l1) + listNodeToInteger(l2);
        return IntegerToListNode(sum);

    }

    public Long listNodeToInteger(ListNode node) {
        List<Long> nums=new ArrayList<>();
        ListNode p = node;
        while (p != null) {
            nums.add(p.val);
            p=p.next;
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = nums.size()-1; i >=0; i--) {
            stringBuilder.append(nums.get(i));
        }
        return (Long.valueOf(stringBuilder.toString()));
    }

    public ListNode IntegerToListNode(Long num) {
        String[] res = String.valueOf(num).split("");
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = res.length-1; i >=0; i--) {
            cur.next = new ListNode(Long.valueOf(res[i]));
            cur = cur.next;
        }
        return head.next;
    }
    static class ListNode {
        long val;
        ListNode next;

        ListNode(long x) {
            val = x;
        }
    }
}
