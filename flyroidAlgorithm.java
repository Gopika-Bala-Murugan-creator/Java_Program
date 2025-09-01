class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class flyroidAlgorithm {
    Node head;
    boolean detectCycle() {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;    
            fast = fast.next.next;   

            if (slow == fast) {
                return true;  
            }
        }
        return false;
    }

    public static void main(String[] args) {
        flyroidAlgorithm list = new flyroidAlgorithm();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        list.head.next.next.next.next.next = list.head.next;

        if (list.detectCycle())
            System.out.println("Cycle detected");
        else
            System.out.println("No cycle");
    }
}
