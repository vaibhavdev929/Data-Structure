package linklist;

import linklist.duble.easy.EDoubleLinkedList;
import linklist.single.SingleLinkedList;

public class LLMain {
    public static void main(String[] args) {
        EDoubleLinkedList linkedList = new EDoubleLinkedList(1);
        linkedList.appendNode(2);
        linkedList.appendNode(3);
        linkedList.appendNode(4);
        linkedList.appendNode(5);
        linkedList.appendNode(6);
        linkedList.appendNode(7);

        linkedList.traverseNode();

        System.out.println("===================");

     }

}
