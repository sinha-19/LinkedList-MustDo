public class AddOneToNumberLinkedList {
    /*
     * Problem: Add 1 to a number represented by a linked list.
     * Approach: Reverse list, add 1, handle carry, reverse back.
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
    public Node addOne(Node head) {
        head = reverse(head);
        Node curr = head;
        int carry = 1;
        while (curr != null && carry > 0) {
            int sum = curr.data + carry;
            curr.data = sum % 10;
            carry = sum / 10;
            if (curr.next == null && carry > 0) {
                curr.next = new Node(0);
            }
            curr = curr.next;
        }
        return reverse(head);
    }
    private Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
