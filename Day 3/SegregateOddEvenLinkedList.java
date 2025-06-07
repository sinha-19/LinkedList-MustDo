public class SegregateOddEvenLinkedList {
    /*
     * Problem: Segregate even and odd nodes in a LinkedList while maintaining order.
     * Approach: Use two separate lists (even & odd), merge them at the end.
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public Node segregateOddEven(Node head) {
        Node evenHead = new Node(0), oddHead = new Node(0);
        Node even = evenHead, odd = oddHead;
        while (head != null) {
            if (head.data % 2 == 0) {
                even.next = head;
                even = even.next;
            } else {
                odd.next = head;
                odd = odd.next;
            }
            head = head.next;
        }
        // Connect even list to odd list
        even.next = oddHead.next;
        odd.next = null;
        return evenHead.next;
    }
}
