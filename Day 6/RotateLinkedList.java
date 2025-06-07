public class RotateLinkedList {
    /*
     * Problem: Rotate a Linked List to the right by k places.
     * Approach: Use length calculation, connect tail to head, find new head and break the circle.
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }
    public Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        Node temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        temp.next = head; // make circular
        k = k % length;
        int steps = length - k;
        Node newTail = head;
        for (int i = 1; i < steps; i++)
            newTail = newTail.next;
        Node newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
