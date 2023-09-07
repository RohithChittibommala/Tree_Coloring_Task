package com.myproject.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides methods for coloring the nodes of a binary tree with 'B' (Black) and 'R' (Red) colors.
 */
public class TreeColoring {

    /**
     * Colors the nodes of a binary tree with 'B' (Black) and 'R' (Red) colors.
     *
     * @param root The root node of the binary tree.
     */
    public static void colorTree(Node root) {

        if(root == null) return;

        List<Node> boundaryNodes = new ArrayList<>();
        boundaryNodes.add(root);

        colorLeftBoundaryNodes(root, boundaryNodes);

        // If the root is not a leaf node, color the leaf nodes.
        if (!isLeafNode(root)) {
            colorLeafNodes(root, boundaryNodes);
        }

        colorRightBoundaryNodes(root, boundaryNodes);

        // Set the colors based on the index in boundaryNodes in alternating fashion.
        for (int ind = 0; ind < boundaryNodes.size(); ind++) {
            boundaryNodes.get(ind).setColor(ind % 2 == 0 ? 'B' : 'R');
        }
    }

    /**
     * Performs an inorder traversal of the binary tree and appends node values and colors to a StringBuilder.
     *
     * @param root    The root node of the binary tree.
     * @param inorder A StringBuilder to store the inorder traversal result.
     */
    public static void inorderTraversal(Node root, StringBuilder inorder) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, inorder);
        if(inorder.length() > 0) {
            inorder.append(" ");
        }
        inorder.append(root.val + "" + root.getColor());
        inorderTraversal(root.right, inorder);
    }

    // Helper method to color the left boundary nodes of the tree.
    private static void colorLeftBoundaryNodes(Node root, List<Node> boundaryElements) {
        Node current = root.left;

        while (current != null) {
            if (!isLeafNode(current)) {
                boundaryElements.add(current);
            }
            current = (current.left != null) ? current.left : current.right;
        }
    }

    // Helper method to color the right boundary nodes of the tree.
    private static void colorRightBoundaryNodes(Node root, List<Node> boundaryElements) {
        Node current = root.right;
        List<Node> tempNodeList = new ArrayList<>();

        while (current != null) {
            if (!isLeafNode(current)) {
                tempNodeList.add(current);
            }
            current = (current.right != null) ? current.right : current.left;
        }

        // Add right boundary nodes in reverse order to maintain the correct order.
        for (int ind = tempNodeList.size() - 1; ind >= 0; ind--) {
            boundaryElements.add(tempNodeList.get(ind));
        }
    }

    // Helper method to check if a node is a leaf node (has no children).
    private static boolean isLeafNode(Node node) {
        return node.left == null && node.right == null;
    }

    // Helper method to color the leaf nodes of the tree.
    private static void colorLeafNodes(Node root, List<Node> boundaryElements) {
        if (isLeafNode(root)) {
            boundaryElements.add(root);
            return;
        }
        if (root.left != null) {
            colorLeafNodes(root.left, boundaryElements);
        }
        if (root.right != null) {
            colorLeafNodes(root.right, boundaryElements);
        }
    }
}
