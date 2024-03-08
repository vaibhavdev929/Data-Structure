package linklist.single;

public class MSingleLinkedList {
    private Node head;


    public MSingleLinkedList(int value) {
        this.head = new Node(value);
    }


    /**
     * ==== 1. Middle element Of Linked List ==========
     */

    public void findMiddleElement() {
        if (head == null) {
            System.out.println("List empty");
            return;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int midCount = count / 2;
        count = 0;
        temp = head;
        while (midCount != count) {
            count++;
            temp = temp.next;
        }
        System.out.println(temp.value);

    }

    // TortoiseHare Method
    public void findMiddleElement1() {
        Node fastForward = head;
        Node midElement = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (fastForward != null && fastForward.next != null) {
            fastForward = fastForward.next.next;
            midElement = midElement.next;
        }
        System.out.println(midElement.value);

    }

    /**
     * ==== 2. Reverse  Of Linked List ==========
     */

    //  1.  Iterative Method
    public void reverseLinkedList() {


    }

    // 2.  Recursive Method
    public void reverseLinkedList1() {

    }

    /**
     * === 3.  Detect Loop in Linked list
     */

    // 1. Brute force
    public void detectLoop() {

    }
    // 2. Detect Loop
    public void detectLoop1() {

    }

    /**
     * == 4. Find Starting Point of Loop in linked list ===
     */
    // 1. Brute force Algo
    public void findStraightPoint() {

    }
    // 2.Two Pointer Algo
    public void findStraightPoint1() {

    }

    /**
     * == 5. Check list palindrome or not ===
     */
    public void checkListIsPalindrome()
    {

    }

    /**
     * == 6. Remove Nth Node From Back ===
     */
    public void removeNthNodeFromBack(int number)
    {

    }

    /**
     * == 7. Delete Middle Node ===
     */
    public void deleteMiddleNode(int number)
    {

    }

    /**
     * == 8. Delete Middle Node ===
     */
    public void sortLinkedList()
    {

    }

    /**
     * === 9. Sort linked list 0's , 1's and 2's ===
     */
    public void sortLinkedList012()
    {

    }





}
