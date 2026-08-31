/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
         if (head == null || head.next == null) {
            return head;
        }

        // Find length
        int n = 0;
        ListNode temp = head;

        while (temp != null) {
            n++;
            temp = temp.next;
        }

        // Avoid unnecessary rotations
        k = k % n;

        if (k == 0) {
            return head;
        }

        // Store first n-k nodes
        ArrayList<Integer> arr = new ArrayList<>();

        temp = head;

        for (int i = 0; i < n - k; i++) {
            arr.add(temp.val);
            temp = temp.next;
        }

        // Move last k nodes to the front
        ListNode newHead = temp;
        ListNode current = newHead;

        while (current.next != null) {
            current = current.next;
        }

        // Attach the stored nodes
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return newHead;
        
    }
}