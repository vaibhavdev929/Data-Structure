package binarysearchtree;


public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(3);
        bst.insert(2);
        bst.insert(1);
        bst.insert(4);
        boolean isContain = bst.isContain(4);
        if (isContain) {
            System.out.println("Value contain");
        } else {
            System.out.println("Value Not contain");
        }
    }
}