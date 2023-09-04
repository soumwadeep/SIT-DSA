class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class RotateLinkedList {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k <= 0) {
            return head;
        }

        // Calculate the length of the linked list
        int length = 1;
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
            length++;
        }

        // Find the new head and tail positions after rotation
        k = k % length; // In case k is greater than the length of the list
        if (k == 0) {
            return head; // No rotation needed
        }

        int stepsToNewHead = length - k - 1;
        ListNode newTail = head;
        for (int i = 0; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null; // Set the new tail's next to null

        // Connect the old tail to the old head to form the rotated list
        current.next = head;

        return newHead;
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
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2; // Number of positions to rotate

        System.out.println("Original Linked List:");
        printList(head);

        ListNode rotated = rotateRight(head, k);

        System.out.println("Linked List after rotation:");
        printList(rotated);
    }
}
