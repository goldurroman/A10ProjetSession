package com.acquisio.basic.java.question02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import jdk.nashorn.internal.objects.NativeArray;

/**
 * QUESTION 2: TreeNode
 * Using the tree structure define at
 * http://en.wikipedia.org/wiki/File:Binary_tree.svg,
 * add the code necessary to optain the following output.
 * ..2
 * ....7
 * ......2
 * ......6
 * ........5
 * ........11
 * ....5
 * ......9
 * ........4
 *
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class TreeNavigation {

    public static void main(String[] args) {
        TreeNavigation main = new TreeNavigation();
        main.treeNode();
    }

    private void treeNode() {
        Node n1 = new Node("6", new Node("5"), new Node("11"));
        Node n2 = new Node("7", new Node("2"), n1);
        Node n3 = new Node("9", new Node("4"));
        Node n4 = new Node("5", null, n3);
        Node n = new Node("2", n2, n4); 
        traversePreOrder(n,"..");
    }
    
    public void traversePreOrder(Node node,String _sep) {
        String sep = _sep;
    if (node != null) {
        System.out.println(sep + node.name);
        if (node.children.length != 0 && node.children[0] != null) traversePreOrder(node.children[0],sep+"..");
        if (node.children.length == 2 && node.children[1] != null) traversePreOrder(node.children[1],sep+"..");
    }
}
}
