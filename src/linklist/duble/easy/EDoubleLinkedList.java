package linklist.duble.easy;

import linklist.duble.DLNode;

public class EDoubleLinkedList {
    public DLNode head;

    public EDoubleLinkedList(int data) {
        this.head = new DLNode(data);
    }

    /**
     * ======= 1.  Delete Node  ==========
     */
    public void appendNode(int data) {
        DLNode node = new DLNode(data);
        if (head == null) {
            this.head = node;
            return;
        }
        DLNode temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        node.prev = temp;
        temp.next = node;
    }

    /**
     * =========== 2. Traverse Node ============
     */
    public void traverseNode() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        DLNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    /**
     * ========= 3. Delete Node ==============
     */
    public void deleteNode()
    {

    }

    /**
     * ========= 4. Reverse Node ================
     */
    public void reverseNode() {

    }

}
