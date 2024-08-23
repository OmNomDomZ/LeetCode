package ru.rabetskii.leetcode.mergeTwoSortedLists_21;

public class ListNode {
    int val;
    ListNode next;
    public ListNode() {};
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void printList(){
        ListNode cur = this;
        while (cur != null) {
            System.out.printf(String.valueOf(cur.val));
            cur = cur.next;
        }
    }
}
