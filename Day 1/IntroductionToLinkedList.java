public class IntroductionToLinkedList {
    /*
     * Problem: Create a basic singly linked list and print it.
     * Approach: Define a Node class and manually link nodes together.
     * Time Complexity: O(N) — for printing the list.
     * Space Complexity: O(1) — excluding the space used for the linked list itself.
     */

    // Node class to represent each element in the list
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Utility function to print the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Creating a linked list: 10 → 20 → 30 → null
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printList(head);
    }
}
