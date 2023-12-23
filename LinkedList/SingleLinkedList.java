package LinkedList;

public class SingleLinkedList {
    Node head=null;

    class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void AddEnd(String data) {
        Node newNode = new Node(data);

        Node traverse = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (traverse.next != null) {
            traverse = traverse.next;
        }
        traverse.next = newNode;
    }

    public void printList() {
        Node traverse = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (traverse != null) {
            System.out.print(traverse.data + " ");
            traverse = traverse.next;
        }
    }

    public static void main(String args[]) {
        SingleLinkedList list = new SingleLinkedList();
        list.addFirst("1");
        list.addFirst("2");
        list.AddEnd("3");
        list.printList();
    }
}
