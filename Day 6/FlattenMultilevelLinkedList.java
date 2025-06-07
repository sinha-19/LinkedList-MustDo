public class FlattenMultilevelLinkedList {
    /*
     * Problem: Flatten a multilevel linked list where each node may have a child pointer to another list.
     * Approach: Use recursion or a stack to flatten child lists into the main list.
     * Time Complexity: O(N)
     * Space Complexity: O(1) for iterative, O(N) auxiliary stack for recursion
     */
    static class Node {
        int val;
        Node next, child;
        Node(int val) { this.val = val; }
    }
    public Node flatten(Node head) {
        if (head == null) return head;
        Node temp = head;
        while (temp != null) {
            if (temp.child != null) {
                Node child = flatten(temp.child);
                Node next = temp.next;
                temp.next = child;
                child.prev = temp;
                temp.child = null;
                while (temp.next != null)
                    temp = temp.next;
                temp.next = next;
                if (next != null) next.prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }
}
