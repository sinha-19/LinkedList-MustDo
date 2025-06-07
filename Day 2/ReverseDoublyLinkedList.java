public class ReverseDoublyLinkedList {
    /*
     * Problem: Reverse a Doubly Linked List.
     * Approach: Traverse the list and swap 'prev' and 'next' pointers at each node.
     *           Update the head pointer to the last node encountered.
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    static class DoublyNode {
        int data;
        DoublyNode prev, next;
        DoublyNode(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    // Reverse the DLL
    public static DoublyNode reverseDLL(DoublyNode head) {
        DoublyNode current = head;
        DoublyNode prevNode = null;
        while (current != null) {
            // Swap previous and next pointers
            DoublyNode temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            // Move to the next node (was previous)
            prevNode = current;
            current = current.prev;
        }
        // Return new head (last node before null)
        return prevNode;
    }
    // Utility function to print DLL
    public static void printDLL(DoublyNode head) {
        DoublyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // DLL: 1 ⇄ 2 ⇄ 3 ⇄ 4 ⇄ null
        DoublyNode head = new DoublyNode(1);
        head.next = new DoublyNode(2);
        head.next.prev = head;
        head.next.next = new DoublyNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new DoublyNode(4);
        head.next.next.next.prev = head.next.next;
        System.out.println("Original DLL:");
        printDLL(head);
        DoublyNode newHead = reverseDLL(head);
        System.out.println("Reversed DLL:");
        printDLL(newHead);
    }
}
