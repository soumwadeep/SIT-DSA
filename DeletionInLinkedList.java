import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DeletionInLinkedList {
    public static ListNode deleteNode(ListNode head, int target) {
        // Handle the case where the target is at the beginning of the list
        while (head != null && head.val == target) {
            head = head.next;
        }

        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == target) {
                current.next = current.next.next; // Skip the node to delete
            } else {
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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        ListNode head = null;
        ListNode tail = null;

        // Create the linked list based on user input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int val = scanner.nextInt();
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.print("Enter the value to delete from the linked list: ");
        int target = scanner.nextInt();

        head = deleteNode(head, target);

        System.out.println("Linked List after deletion:");
        printList(head);

        scanner.close();
    }
}
