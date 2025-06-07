public class ReverseLinkedListInKGroups {
    /*
     * Problem: Reverse nodes of a linked list in groups of size k.
     * Approach: Reverse every k nodes using recursion or iteration.
     * Time Complexity: O(N)
     * Space Complexity: O(N/k) recursion stack or O(1) for iterative version
     */
    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }
    public Node reverseKGroup(Node head, int k) {
        Node temp = head;
        int count = 0;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        if (count < k) return head;
        Node prev = null, curr = head, next = null;
        count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if (next != null)
            head.next = reverseKGroup(next, k);
        return prev;
    }
}
