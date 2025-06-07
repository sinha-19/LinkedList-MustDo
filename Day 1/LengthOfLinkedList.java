public class LengthOfLinkedList {
    /*
     * Problem: Find the length of a singly linked list.
     * Approach: Traverse the list and count the number of nodes.
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Function to calculate the length of the list
    static int getLength(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        // Sample list: 5 → 15 → 25 → null
        Node head = new Node(5);
        head.next = new Node(15);
        head.next.next = new Node(25);
        System.out.println("Length of the list: " + getLength(head));
    }
}
