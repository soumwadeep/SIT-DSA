public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LargestNumber {
    public static int findLargestNumber(ListNode head) {
        if (head == null) {
            // Handle the case where the linked list is empty
            throw new IllegalArgumentException("Linked list is empty");
        }

        int max = head.val; // Initialize max with the value of the first node

        // Iterate through the linked list to find the largest number
        ListNode current = head;
        while (current != null) {
            if (current.val > max) {
                max = current.val; // Update max if a larger value is encountered
            }
            current = current.next; // Move to the next node
        }

        return max;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(10);
        head.next = new ListNode(5);
        head.next.next = new ListNode(20);
        head.next.next.next = new ListNode(15);

        // Find the largest number in the linked list
        int largestNumber = findLargestNumber(head);

        System.out.println("The largest number in the linked list is: " + largestNumber);
    }
}
