package com.guner.codility;
// Java program for different tree traversals
 
/* Class containing left and right child of current
   node and key value*/
class Tree {
    int key;
    Tree left, right;
 
    public Tree(int item)
    {
        key = item;
        left = right = null;
    }
}
 
class BinaryTree {
    // Root of Binary Tree
    Tree root;
 
    BinaryTree() { root = null; }
 
    /* Given a binary tree, print its nodes according to the
      "bottom-up" postorder traversal. */
    void printPostorder(Tree tree)
    {
        if (tree == null)
            return;
 
        // first recur on left subtree
        printPostorder(tree.left);
 
        // then recur on right subtree
        printPostorder(tree.right);
 
        // now deal with the node
        System.out.print(tree.key + " ");
    }
 
    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(Tree tree)
    {
        if (tree == null)
            return;
 
        /* first recur on left child */
        printInorder(tree.left);
 
        /* then print the data of node */
        System.out.print(tree.key + " ");
 
        /* now recur on right child */
        printInorder(tree.right);
    }
 
    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(Tree tree)
    {
        if (tree == null)
            return;
 
        /* first print data of node */
        System.out.print(tree.key + " ");
 
        /* then recur on left subtree */
        printPreorder(tree.left);
 
        /* now recur on right subtree */
        printPreorder(tree.right);
    }
 
    // Wrappers over above recursive functions
    void printPostorder() { printPostorder(root); }
    void printInorder() { printInorder(root); }
    void printPreorder() { printPreorder(root); }
 
    // Driver method
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Tree(1);
        tree.root.left = new Tree(2);
        tree.root.right = new Tree(3);
        tree.root.left.left = new Tree(4);
        tree.root.left.right = new Tree(5);
 
        System.out.println(
            "Preorder traversal of binary tree is ");
        tree.printPreorder();
 
        /*
        System.out.println(
            "\nInorder traversal of binary tree is ");
        tree.printInorder();
 
        System.out.println(
            "\nPostorder traversal of binary tree is ");
        tree.printPostorder();

         */
    }
}