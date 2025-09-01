class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class PairwiseSwap {
    Node head;

    Node swapPairs(Node head) {

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = first.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }

        return dummy.next;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PairwiseSwap list = new PairwiseSwap();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        System.out.println("Original list:");
        list.printList(list.head);

        list.head = list.swapPairs(list.head);

        System.out.println("List after pairwise swap:");
        list.printList(list.head);
    }
}
