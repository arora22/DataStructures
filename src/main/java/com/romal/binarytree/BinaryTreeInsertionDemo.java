package com.romal.binarytree;

public class BinaryTreeInsertionDemo {

   @SuppressWarnings("unused")
   public static void main(String[] args) {

      BinarySearchTree tree1 = new BinarySearchTree();
      BinarySearchTree tree2 = new BinarySearchTree();
      Integer[] treeItems1 = { 52, 65, 39, 25, 33, 78, 60 };
      Integer[] treeItems2 = { 52, 33, 25, 39, 65, 60, 78 };

      //      tree.insert(52); // this is the root node
      //      tree.insert(65);
      //      tree.insert(39);
      //      tree.insert(25);
      //      tree.insert(33);
      //      tree.insert(78);
      //      tree.insert(60);

      tree1 = new BinaryTreeInsertionDemo().insertItemsIntoTree(treeItems1);
      tree2 = new BinaryTreeInsertionDemo().insertItemsIntoTree(treeItems2);

      // *************Output of treeItems1*****************
      // .................52......................
      // ................/..\.....................
      // .............../....\....................
      // ............../......\...................
      // .............39......65..................
      // ............/..\..../..\.................
      // ..........25...?...60...78...............
      // ............\............................
      // ............33...........................
      // *****************************************

      // *************Output of treeItems2***************
      // .................52......................
      // ................/..\.....................
      // .............../....\....................
      // ............../......\...................
      // .............33......65..................
      // ............/..\..../..\.................
      // ..........25...39..60...78...............
      // ******************************************

   }

   public BinarySearchTree insertItemsIntoTree(Integer[] treeItems) {
      BinarySearchTree tree = new BinarySearchTree();

      for (Integer treeData : treeItems) {
         tree.insert(treeData);
      }

      return tree;
   }
}
