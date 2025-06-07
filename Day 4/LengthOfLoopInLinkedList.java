public class LengthOfLoopInLinkedList {
    /*
     * Problem: Find the length of the loop in a linked list.
     * Approach: After detecting the loop, keep one pointer fixed and move the other until they meet again.
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
    public int countLoopLength(Node head) {
        Node slow = head, fast = head;
        // Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return getLoopLength(slow);
        }
        return 0;
    }
    private int getLoopLength(Node loopNode) {
        int length = 1;
        Node current = loopNode.next;
        while (current != loopNode) {
            length++;
            current = current.next;
        }
        return length;
    }
}
