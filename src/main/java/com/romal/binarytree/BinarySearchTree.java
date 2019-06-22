package com.romal.binarytree;

public class BinarySearchTree {

   private TreeNode root;

   public void insert(Integer data) {
      if (this.root == null) {
         this.root = new TreeNode(data);
      } else {
         this.root.insert(data);
      }
   }

   public TreeNode find(Integer data) {
      if (root != null)
         return root.find(data);
      return null;
   }

   /**
    * Three cases are there to consider:
    * <p>
    * 1) Node to be deleted is a leaf
    * <p>
    * 2) Node to be deleted has one child
    * <p>
    * 3) Node to be deleted has two children
    */
   public void delete(Integer data) {
      TreeNode current = this.root;
      TreeNode parent = this.root;
      boolean isLeftChild = false;

      if (current == null) {
         return;
      }

      while (current != null && current.getData() != data) {
         parent = current;

         if (data < current.getData()) {
            current = current.getLeftChild();
            isLeftChild = true;
         } else {
            current = current.getRightChild();
            isLeftChild = false;
         }
      }

      if (current == null) {
         return;
      }

      if (current.getLeftChild() == null && current.getRightChild() == null) {
         if (current == this.root) {
            this.root = null;
         } else {
            if (isLeftChild) {
               parent.setLeftChild(null);
            }
         }
      } else if (current.getRightChild() == null) {
         if (current == this.root) {
            this.root = current.getLeftChild();
         } else if (isLeftChild) {
            parent.setLeftChild(current.getLeftChild());
         } else {
            parent.setRightChild(current.getRightChild());
         }

      } else if (current.getLeftChild() == null) {
         if (current == this.root) {
            this.root = current.getRightChild();
         } else if (isLeftChild) {
            parent.setLeftChild(current.getRightChild());
         } else {
            parent.setRightChild(current.getLeftChild());
         }

      }
   }

}
