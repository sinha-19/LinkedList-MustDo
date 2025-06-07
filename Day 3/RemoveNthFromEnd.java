public class RemoveNthFromEnd {
    /*
     * Problem: Remove the N-th node from the end of a linked list.
     * Approach: Use two-pointer technique. First pointer moves n steps ahead,
     *           then move both pointers until the first hits null.
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy, slow = dummy;
        // Move fast n steps ahead
        for (int i = 0; i < n; i++) fast = fast.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
