package linklist.single;

public class SingleLinkedList {
    private Node head;
    private Node tell;
    private int length;

    public SingleLinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tell = newNode;
        this.length = 1;
    }

    /**
     * 1. Insert Node At last position ============
     */
    public void appendNewNode(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            this.head = newNode;
            this.tell = newNode;
            this.length = 1;
        } else {
            tell.next = newNode;
            tell = newNode;
        }
        length++;
    }

    /**
     * 2. Insert  Node at first position ==============
     */
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tell = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }


    /**
     * 3. Removed First Node  ==============
     */
    public Node removeFirstNode() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        if (temp == tell) {
            head = null;
            tell = null;
        } else {
            head = head.next;
        }
        temp.next = null;
        length--;
        return temp;


    }

    /**
     * 4. Removed Last Node =================
     */
    public void removeLastNode() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Linked List empty");
            return;
        }
        if (head == tell) {
            head = null;
            tell = null;
        } else {
            while (temp.next.next != null) {
                temp = temp.next;
            }
            tell = temp;
            temp.next = null;
        }
        length--;

    }

    /**
     * 5. Traverse List
     */
    public void printLinkedList() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List empty");
            return;
        }
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }




}
