public class ReverseLinkedListRecursive {
    /*
     * Problem: Reverse a linked list recursively.
     * Approach: Use recursion stack to reach the end and reverse the pointers.
     * Time Complexity: O(N)
     * Space Complexity: O(N) due to recursion stack
     */
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public Node reverseList(Node head) {
        if (head == null || head.next == null) return head;
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
