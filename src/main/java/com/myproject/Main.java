package com.myproject;

import com.myproject.tree.Node;
import com.myproject.tree.TreeColoring;
import com.myproject.tree.MockTreeBuilder;

public class Main {

    public static void main(String[] args) {
            Node root = MockTreeBuilder.getTest1Tree();
            TreeColoring.colorTree(root);
            StringBuilder inorder = new StringBuilder();
            TreeColoring.inorderTraversal(root, inorder);
            System.out.println(inorder);
    }
}
