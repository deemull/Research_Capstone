package com.company;

public class Main {

    public static void main(String[] args) {
        BTNode node = new BTNode(10);
        node.printInorder(node);
        node.printPostorder(node);
        node.printPreorder(node);
    }
}
