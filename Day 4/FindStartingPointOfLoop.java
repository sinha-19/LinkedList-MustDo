public class FindStartingPointOfLoop {
    /*
     * Problem: Find the starting node of the loop in a linked list.
     * Approach: Use Floyd’s cycle detection to find the meeting point,
     * then move one pointer to head and both at 1 step to find start.
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
    public Node detectCycleStart(Node head) {
        Node slow = head, fast = head;
        // Step 1: Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        // No cycle
        if (fast == null || fast.next == null)
            return null;
        // Step 2: Find starting node
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
