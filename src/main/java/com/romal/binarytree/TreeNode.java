package com.romal.binarytree;

public class TreeNode {

   private Integer data;
   private TreeNode leftChild;
   private TreeNode rightChild;

   public TreeNode(Integer data) {
      this.data = data;
   }

   public TreeNode find(Integer data) {
      if (this.data == data)
         return this;
      if (data < this.data && leftChild != null)
         return leftChild.find(data);
      if (data > this.data && rightChild != null) /// this was shown as if (rightChild != null)
         return rightChild.find(data);
      return null;
   }

   public void insert(Integer data) {
      if (data >= this.data) {
         if (this.rightChild == null) {
            this.rightChild = new TreeNode(data);
         } else {
            this.rightChild.insert(data);
         }
      } else {
         if (this.leftChild == null) {
            this.leftChild = new TreeNode(data);
         } else {
            this.leftChild.insert(data);
         }
      }
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
