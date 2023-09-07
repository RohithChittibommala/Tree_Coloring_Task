package com.myproject.tree;

public class Node {
    public  Node left;
    public  Node right;
    private char color;
    public int val;

    public Node(int val) {
        this.val = val;
        this.color = 'G'; // setting default color as G
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Node{" +
                "left=" + left +
                ", right=" + right +
                ", color=" + color +
                ", val=" + val +
                '}';
    }
}
