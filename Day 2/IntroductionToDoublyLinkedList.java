public class IntroductionToDoublyLinkedList {
    /*
     * Problem: Create and print a basic Doubly Linked List (DLL).
     * Approach: Define a DoublyNode class with 'prev', 'data', and 'next' pointers.
     *           Manually link the nodes to form a list, and print in forward direction.
     * Time Complexity: O(N) for printing
     * Space Complexity: O(1) (excluding DLL size)
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
    // Print the DLL in forward direction
    public static void printDLL(DoublyNode head) {
        DoublyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Creating DLL: 10 ⇄ 20 ⇄ 30 ⇄ null
        DoublyNode head = new DoublyNode(10);
        DoublyNode second = new DoublyNode(20);
        DoublyNode third = new DoublyNode(30);
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        printDLL(head);
    }
}
