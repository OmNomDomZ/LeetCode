package ru.rabetskii.leetcode.problem_2;

public class ListNode {
    int val;
    ListNode next;
    public ListNode() {}
    public ListNode(int x) {
        this.val = x;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = this;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.toString();
    }
}
