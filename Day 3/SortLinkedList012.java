public class SortLinkedList012 {
    /*
     * Problem: Sort a LinkedList containing 0s, 1s and 2s by changing links (not values).
     * Approach: Create 3 separate dummy lists for 0s, 1s and 2s and connect them.
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
    public Node sortList(Node head) {
        Node zeroD = new Node(0), oneD = new Node(0), twoD = new Node(0);
        Node zero = zeroD, one = oneD, two = twoD;
        while (head != null) {
            if (head.data == 0) zero.next = head;
            else if (head.data == 1) one.next = head;
            else two.next = head;
            if (head.data == 0) zero = zero.next;
            else if (head.data == 1) one = one.next;
            else two = two.next;
            head = head.next;
        }
        // Connecting three lists
        zero.next = oneD.next != null ? oneD.next : twoD.next;
        one.next = twoD.next;
        two.next = null;
        return zeroD.next;
    }
}
