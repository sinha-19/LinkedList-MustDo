public class FindIntersectionPointYLinkedLists {
    /*
     * Problem: Find intersection point of two Y-shaped linked lists.
     * Approach: Get lengths, align both lists, and move together to find intersection.
     * Time Complexity: O(N + M)
     * Space Complexity: O(1)
     */
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public Node getIntersectionNode(Node headA, Node headB) {
        int lenA = getLength(headA), lenB = getLength(headB);
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }
        while (headA != null && headB != null) {
            if (headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
    private int getLength(Node head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
