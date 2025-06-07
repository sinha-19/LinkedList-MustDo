public class SortLinkedList {
    /*
     * Problem: Sort a linked list in O(n log n) time and constant space.
     * Approach: Use merge sort.
     * Time Complexity: O(N log N)
     * Space Complexity: O(log N) recursive stack
     */
    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }
    public Node sortList(Node head) {
        if (head == null || head.next == null) return head;
        Node mid = getMiddle(head);
        Node right = mid.next;
        mid.next = null;
        Node leftSorted = sortList(head);
        Node rightSorted = sortList(right);
        return merge(leftSorted, rightSorted);
    }
    private Node merge(Node a, Node b) {
        Node dummy = new Node(0), tail = dummy;
        while (a != null && b != null) {
            if (a.val < b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        tail.next = (a != null) ? a : b;
        return dummy.next;
    }
    private Node getMiddle(Node head) {
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
