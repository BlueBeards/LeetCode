package com.bluebeard;

/**
 * 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,1,2]
 * 输出：[1,2]
 * 示例 2：
 *
 *
 * 输入：head = [1,1,2,3,3]
 * 输出：[1,2,3]
 *  
 *
 * 提示：
 *
 * 链表中节点数目在范围 [0, 300] 内
 * -100 <= Node.val <= 100
 * 题目数据保证链表已经按升序 排列
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class _02_删除排序链表中的重复元素 {
    public ListNode deleteDuplicates1(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode headNode = new ListNode(-1);
        ListNode prev = head;
        while (head != null) {
            if (head.next == null || head.val != head.next.val) {
                prev.next = head;
                prev = prev.next;
            }
            head = head.next;
        }

        return headNode.next;

    }

    public  ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }

        return head;

    }
}
