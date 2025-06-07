public class DetectLoopInLinkedList {
    /*
     * Problem: Detect if a cycle exists in a linked list.
     * Approach: Tortoise & Hare (Floyd’s cycle detection algorithm).
     * If fast and slow meet, a loop exists.
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
    public boolean hasCycle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}
