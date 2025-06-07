public class AddTwoNumbersLinkedList {
    /*
     * Problem: Add two numbers represented by linked lists.
     * Each node contains a single digit, and the digits are stored in reverse order.
     * Approach: Traverse both lists while adding corresponding digits and carry.
     * Time Complexity: O(max(N, M))
     * Space Complexity: O(max(N, M)) for result list
     */
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
        }
        return dummy.next;
    }
}
