package com.myproject.tree;

public class MockTreeBuilder {

    public static Node getTest1Tree() {
        Node root = new Node(1);
        return root;
    }

    public static Node getTest2Tree() {
        Node root = new Node(1);
        Node node2= new Node(2);
        Node node3= new Node(3);
        Node node4= new Node(4);
        root.left = node2;
        node2.right = node3;
        node3.left = node4;
        return  root;
    }


    public static Node getTest3Tree(){
        Node root = new Node(1);
        Node node2= new Node(2);
        Node node3= new Node(3);
        Node node4= new Node(4);
        Node node5= new Node(5);
        Node node6= new Node(6);
        root.left  = node2;
        root.right = node3;
        node2.left = node4;
        node4.left = node5;
        node4.right = node6;
        return  root;
    }

    public static Node getTest4Tree(){
        Node root = new Node(1);
        Node node2= new Node(2);
        Node node3= new Node(3);
        Node node4= new Node(4);
        Node node5= new Node(5);
        root.left  = node2;
        root.right = node3;
        node2.left = node4;
        node3.right = node5;
        return  root;
    }

    public static Node getTest5Tree(){
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);
        root.left  = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node4.right = node8;
        node5.right = node9;
        node3.left = node6;
        node3.right = node7;
        node7.left = node10;
        node7.right = node11;
        return  root;
    }

    public static Node getTest6Tree() {
        Node[] nodes = new Node[32];

        for (int i = 1; i <= 31; i++) {
            nodes[i] = new Node(i);
        }

        for(int ind = 1; ind <= 15; ind++) {
            nodes[ind].left = nodes[ind*2];
            nodes[ind].right = nodes[ind*2+1];
        }

        return  nodes[1];
    }

    public static Node getTest7Tree() {
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node4.left = node6;
        node6.left = node7;
        node3.left = node8;
        node3.right = node9;
        node8.left = node10;
        return root;
    }
}
