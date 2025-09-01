class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class RemoveDuplicatesSorted {
    Node head;

    void removeDuplicates() {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDuplicatesSorted list = new RemoveDuplicatesSorted();
        list.head = new Node(6);
        list.head.next = new Node(15);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(28);
        list.head.next.next.next.next = new Node(28);
        list.head.next.next.next.next.next = new Node(35);
        list.head.next.next.next.next.next.next = new Node(40);

        System.out.println("Original list:");
        list.printList(list.head);

        list.removeDuplicates();

        System.out.println("List after removing duplicates:");
        list.printList(list.head);
    }
}
