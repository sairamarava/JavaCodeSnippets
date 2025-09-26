class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class ReverseLinkedList {
    Node head;

    // Insert node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // Reverse linked list (iterative)
    public void reverse() {
        Node prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;   // store next   
            curr.next = prev;   // reverse link 
            prev = curr;        // move prev
            curr = next;                           // move curr
        }
        head = prev;
    } 

    // Print linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Driver
    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.print("Original List: ");
        list.printList();

        list.reverse();
        System.out.print("Reversed List: ");
        list.printList();
    }
}
