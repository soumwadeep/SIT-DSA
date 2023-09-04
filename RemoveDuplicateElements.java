class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveDuplicateElements {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Duplicate found, skip the next node by adjusting pointers
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a sorted linked list with duplicates
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.println("Original Linked List:");
        printList(head);

        // Remove duplicates
        head = deleteDuplicates(head);

        System.out.println("Linked List after removing duplicates:");
        printList(head);
    }
}
