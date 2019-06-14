package com.romal.binarytree;

public class BinarySearchTree {

   private TreeNode root;

   public void insert(Integer data) {
   }

   public TreeNode find(Integer data) {

      if (root != null)
         return root.find(data);
      return null;
   }

   public void delete(Integer data) {
   }

}
