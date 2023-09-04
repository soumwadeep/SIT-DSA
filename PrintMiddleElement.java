class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class PrintMiddleElement {
    public static int findMiddle(ListNode head) {
        if (head == null) {
            return -1; // No elements in the linked list
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.val;
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
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        int middle = findMiddle(head);

        if (middle != -1) {
            System.out.println("Middle element of the Linked List: " + middle);
        } else {
            System.out.println("The Linked List is empty.");
        }
    }
}
