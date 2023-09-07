package com.myproject.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeColoring {
    public static void colorTree(Node root) {

        if(root == null) return;

        List<Node> boundaryNodes = new ArrayList<>();
        boundaryNodes.add(root);

        colorLeftBoundaryNodes(root, boundaryNodes);
        if (!isLeafNode(root)) {
            colorLeafNodes(root, boundaryNodes);
        }
        colorRightBoundaryNodes(root, boundaryNodes);

        for (int ind = 0; ind < boundaryNodes.size(); ind++) {
            boundaryNodes.get(ind).setColor(ind % 2 == 0 ? 'B' : 'R');
        }
    }

    private static void colorLeftBoundaryNodes(Node node, List<Node> boundaryElements) {
        Node current = node.left;

        while (current != null) {
            if (!isLeafNode(current)) {
                boundaryElements.add(current);
            }
            current = (current.left != null) ? current.left : current.right;
        }
    }

    private static void colorRightBoundaryNodes(Node node, List<Node> boundaryElements) {
        Node current = node.right;
        List<Node> tempNodeList = new ArrayList<>();

        while (current != null) {
            if (!isLeafNode(current)) {
                tempNodeList.add(current);
            }
            current = (current.right != null) ? current.right : current.left;
        }

        for (int ind = tempNodeList.size() - 1; ind >= 0; ind--) {
            boundaryElements.add(tempNodeList.get(ind));
        }
    }

    private static boolean isLeafNode(Node node) {
        return node.left == null && node.right == null;
    }

    private static void colorLeafNodes(Node node, List<Node> boundaryElements) {
        if (isLeafNode(node)) {
            boundaryElements.add(node);
            return;
        }
        if (node.left != null) {
            colorLeafNodes(node.left, boundaryElements);
        }
        if (node.right != null) {
            colorLeafNodes(node.right, boundaryElements);
        }
    }

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
}
