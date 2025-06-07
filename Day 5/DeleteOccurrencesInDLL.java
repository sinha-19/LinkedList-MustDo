public class DeleteOccurrencesInDLL {
    /*
     * Problem: Delete all occurrences of a given key in a Doubly Linked List.
     * Approach: Traverse the list, and whenever the key is matched, remove that node by adjusting the prev and next pointers.
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
    public Node deleteAllOccurrences(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                if (current.prev != null)
                    current.prev.next = current.next;
                else
                    head = current.next;
                if (current.next != null)
                    current.next.prev = current.prev;
            }
            current = current.next;
        }
        return head;
    }
}
