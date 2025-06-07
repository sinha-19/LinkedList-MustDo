public class DeleteMiddleNodeLinkedList {
    /*
     * Problem: Delete the middle node from a linked list.
     * Approach: Use slow and fast pointers to find the middle and maintain a prev pointer to remove it.
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
    public Node deleteMiddle(Node head) {
        if (head == null || head.next == null)
            return null;
        Node slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // Delete middle node
        prev.next = slow.next;
        return head;
    }
}
