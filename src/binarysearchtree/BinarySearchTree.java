package binarysearchtree;



public class BinarySearchTree {
    public BSTNode root;

    /**
     * Inserts a new node into the Binary Search Tree (BST) while maintaining the BST properties.
     * <p>
     * NOTE: To insert a new node, the following conditions are checked:
     * 1. If the root node is null, the tree is empty, so the new node is inserted as the root and returned.
     * 2. If the new node's value is equal to an existing node's value, the insertion is rejected.
     * 3. If the new node's value is greater than the root's value, it moves to the right child.
     * 4. If the new node's value is less than the root's value, it moves to the left child.
     * 5. The new node is inserted when a null node is encountered.
     *
     * @param value The data value of the new node to be inserted.
     * @return True if the insertion is successful, false if the value already exists.
     */
    public boolean insert(int value) {
        BSTNode newNode = new BSTNode(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        BSTNode current = root;
        while (true) {
            if (current.value == newNode.value) {
                return false;
            }
            if (newNode.value > current.value) {
                if (current.rightNode == null) {
                    current.rightNode = newNode;
                    return true;
                }
                current = current.rightNode;
            } else {
                if (current.leftNode == null) {
                    current.leftNode = newNode;
                    return true;
                }
                current = current.leftNode;
            }
        }
    }

    /**
     * Checks whether the Binary Search Tree (BST) contains a node with the given value.
     * <p>
     * NOTE: To check for the existence of a node with the given value, the following steps are performed:
     * 1. If the root node is null, the tree is empty, so return false.
     * 2. If the value is greater than the current node's value, move to the right child.
     * 3. If the value is less than the current node's value, move to the left child.
     * 4. If the value matches the current node's value, return true.
     * 5. If the value is not found, return false.
     *
     * @param value The integer value to be checked for existence.
     * @return True if the value exists in the tree, false if not.
     */
    public boolean isContain(int value) {
        if (root == null) {
            return false;
        }
        BSTNode currentNode = root;
        while (currentNode != null) {
            if (value > currentNode.value) {
                currentNode = currentNode.rightNode;
            } else if (value < currentNode.value) {
                currentNode = currentNode.leftNode;
            } else {
                return true;
            }
        }
        return false;
    }
}
