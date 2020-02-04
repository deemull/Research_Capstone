package com.company;

public class BTNode {
    private int key;
    private BTNode left, right;

    public BTNode(int item)
    {
        key = item;
        left = right = null;
    }
    public void  printPostorder(BTNode node) {
        if (node == null)
            return;

        printPostorder(node.left); // left subtree first
        printPostorder(node.right); // right subtree
        System.out.print(node.key + " ");
    }
    public void printInorder(BTNode node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }
    public void printPreorder(BTNode node) {
        if (node == null)
            return;

        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
}
