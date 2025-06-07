public class MiddleOfLinkedList {
    /*
     * Problem: Find the middle of a linked list using Tortoise & Hare method.
     * Approach: Use two pointers - slow (moves 1 step), fast (moves 2 steps).
     * When fast reaches the end, slow will be at the middle.
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
    public Node findMiddle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
