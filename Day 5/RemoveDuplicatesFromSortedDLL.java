public class RemoveDuplicatesFromSortedDLL {
    /*
     * Problem: Remove duplicate nodes from a sorted Doubly Linked List.
     * Approach: Traverse the list, if current node has the same data as the next node, delete the next node.
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    static class Node {
        int data;
        Node next, prev;
        Node(int data) {
            this.data = data;
        }
    }
    public Node removeDuplicates(Node head) {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                Node nextNext = current.next.next;
                current.next = nextNext;
                if (nextNext != null)
                    nextNext.prev = current;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
