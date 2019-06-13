package com.romal.binarytree;

public class TreeNode {

   private Integer data;
   private TreeNode leftChild;
   private TreeNode rightChild;

   public TreeNode(Integer data) {
      this.data = data;
   }

   /**
    * No setter is created for data to keep it from changing once it has been set
    * in a node
    */
   public Integer getData() {
      return data;
   }

   public TreeNode getLeftChild() {
      return leftChild;
   }

   public void setLeftChild(TreeNode leftChild) {
      this.leftChild = leftChild;
   }

   public TreeNode getRightChild() {
      return rightChild;
   }

   public void setRightChild(TreeNode rightChild) {
      this.rightChild = rightChild;
   }
}
