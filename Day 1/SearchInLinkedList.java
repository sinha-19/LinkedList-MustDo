public class SearchInLinkedList {
    /*
     * Problem: Search for an element in a singly linked list.
     * Approach: Traverse the list and compare each node's data with the target key.
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
    // Function to search a key in the list
    static boolean search(Node head, int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        // Sample list: 1 → 2 → 3 → 4 → null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        int key = 3;
        System.out.println("Is " + key + " present? " + search(head, key));
    }
}
