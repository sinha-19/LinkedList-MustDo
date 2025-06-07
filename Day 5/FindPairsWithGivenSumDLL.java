import java.util.*;
public class FindPairsWithGivenSumDLL {
    /*
     * Problem: Find all pairs in a Doubly Linked List whose sum is equal to a given value.
     * Approach: Use two pointers - one from start, one from end. Move accordingly to find all pairs.
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    static class Node {
        int data;
        Node next, prev;
        Node(int data) {
            this.data = data;
        }
    }
    public void findPairs(Node head, int target) {
        Node left = head;
        Node right = head;
        // Move right to the end
        while (right.next != null)
            right = right.next;
        boolean found = false;
        while (left != null && right != null && left != right && right.next != left) {
            int sum = left.data + right.data;
            if (sum == target) {
                System.out.println("(" + left.data + ", " + right.data + ")");
                found = true;
                left = left.next;
                right = right.prev;
            } else if (sum < target) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }
        if (!found) {
            System.out.println("No pair found");
        }
    }
}
