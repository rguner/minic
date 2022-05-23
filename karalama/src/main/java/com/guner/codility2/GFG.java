package com.guner.codility2;

import java.util.*;
class GFG
{
 
// A node of binary tree
static class Tree
{
    int x;
    Tree l, r;
};
 
// A utility function to create a new Binary
// Tree node
static Tree newNode(int data)
{
    Tree temp = new Tree();
    temp.x = data;
    temp.l = temp.r = null;
    return temp;
}

    static int solution(Tree tree)
    {
        if (tree == null)
            return 0;

        Set<Integer> hashSet = new HashSet<>();
        return distinctTraverse(tree, hashSet);
    }

    private static int distinctTraverse(Tree root, Set<Integer> mSet) {

        if (root == null || mSet.contains(root.x)) {
            return mSet.size();
        }

        mSet.add(root.x);
        int l = distinctTraverse(root.l, mSet);
        int r = distinctTraverse(root.r, mSet);
        mSet.remove(root.x);

        return Math.max(l, r);
    }



public static void main(String[] args)
{
    // Create binary tree shown in above figure
    Tree tree = newNode(1);
    tree.l = newNode(2);
    tree.r = newNode(3);
    tree.l.l = newNode(4);
    tree.l.r = newNode(5);
    tree.r.l = newNode(6);
    tree.r.r = newNode(7);
    tree.r.l.r = newNode(8);
    tree.r.r.r = newNode(9);
/*
    Tree tree = newNode(1);
    tree.left = newNode(2);
    tree.right = newNode(2);
    tree.left.left = newNode(1);
    tree.left.right = newNode(2);
    tree.right.left = newNode(4);
    tree.right.right = newNode(1);

 */
/*
    Tree tree = newNode(1);
    tree.left = null;
    tree.right = newNode(2);
    tree.right.left = newNode(1);
    tree.right.right = newNode( 1);


 */
/*
    Tree tree = newNode(1);
    tree.l = newNode(2);
    tree.r = newNode(2);
    tree.r.l = newNode(1);
    tree.r.r = newNode( 2);
    tree.r.l = newNode(4);
    tree.r.r = newNode(1);

    Example test:   (1, None, (2, (1, None, None), (1, (4, None, None), None)))
WRONG ANSWER (got 3 expected 2)
 */






    System.out.println(solution(tree));
}
}
 
// This code is contributed by Princi Singh