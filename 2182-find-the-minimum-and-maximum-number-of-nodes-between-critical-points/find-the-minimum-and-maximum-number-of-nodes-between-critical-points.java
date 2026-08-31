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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1, -1};

        if (head == null || head.next == null || head.next.next == null) {
            return ans;
        }

        ListNode prev = head;
        ListNode curr = head.next;

        int position = 1;

        int first = -1;
        int last = -1;
        int minDistance = Integer.MAX_VALUE;

        while (curr.next != null) {

           
            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val)) {

                
                if (first == -1) {
                    first = position;
                }

                
                if (last != -1) {
                    minDistance = Math.min(minDistance, position - last);
                }

                last = position;
            }

            prev = curr;
            curr = curr.next;
            position++;
        }

        
        if (first == last) {
            return ans;
        }

        
        int maxDistance = last - first;

        ans[0] = minDistance;
        ans[1] = maxDistance;

        return ans;
    }
}