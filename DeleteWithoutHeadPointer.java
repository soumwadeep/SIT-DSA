class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class DeleteWithoutHeadPointer {
    public static void deleteNode(ListNode nodeToDelete) {
        if (nodeToDelete == null || nodeToDelete.next == null) {
            // Cannot delete the last node or a null node
            return;
        }

        ListNode nextNode = nodeToDelete.next;
        nodeToDelete.val = nextNode.val;
        nodeToDelete.next = nextNode.next;
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
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("Original Linked List:");
        printList(head);

        // Delete the node with value 3
        deleteNode(node3);

        System.out.println("Linked List after deleting node with value 3:");
        printList(head);
    }
}
