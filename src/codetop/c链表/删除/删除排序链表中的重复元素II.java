package codetop.c链表.删除;

import 数据结构.ListNode;

/**
 * @Description leetcode 82
 * @Author spli
 * @Date 2022/2/24 09:42
 * 输入: 1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
 * 输出: 1 -> 2 -> 5
 * 解释: 重复的全不要了
 */
public class 删除排序链表中的重复元素II {
    public static ListNode test(ListNode head) {
        return null;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode4.setNext(listNode5);
        listNode3.setNext(listNode4);
        listNode2.setNext(listNode3);
        listNode1.setNext(listNode2);
        ListNode result = test(listNode1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
