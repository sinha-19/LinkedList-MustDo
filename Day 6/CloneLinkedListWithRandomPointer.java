import java.util.*;
public class CloneLinkedListWithRandomPointer {
    /*
     * Problem: Clone a linked list where each node has a random pointer.
     * Approach: Interweave nodes -> assign random -> separate.
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    static class Node {
        int val;
        Node next, random;
        Node(int val) {
            this.val = val;
        }
    }
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node curr = head;
        // Step 1: Clone and insert
        while (curr != null) {
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }
        // Step 2: Assign random pointers
        curr = head;
        while (curr != null) {
            if (curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }
        // Step 3: Separate original and copy
        curr = head;
        Node dummy = new Node(0), copy = dummy;
        while (curr != null) {
            copy.next = curr.next;
            curr.next = curr.next.next;
            curr = curr.next;
            copy = copy.next;
        }
        return dummy.next;
    }
}
