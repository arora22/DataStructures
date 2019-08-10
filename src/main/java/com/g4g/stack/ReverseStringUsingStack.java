package com.g4g.stack;

/**
 * @author romal
 *
 *         Reverse a String using Stack data structure
 *
 */
public class ReverseStringUsingStack {
   Node root;

   static class Node {
      Node next;
      char data;

      Node(char data) {
         this.data = data;
      }
   }

   void push(char data) {
      Node newNode = new Node(data);
      if (root == null) {
         root = newNode;
      } else {
         Node temp = root;
         root = newNode;
         root.next = temp;
      }
      System.out.println(data + " is pushed into stack");
   }

   char pop() {
      char data = Character.MIN_VALUE;
      if (root == null) {
         System.out.println("stack is empty");
      } else {
         data = root.data;
         root = root.next;
         System.out.println(data + " is popped out of stack");
      }
      return data;
   }

   public static void main(String[] args) {
      ReverseStringUsingStack rs = new ReverseStringUsingStack();
      String input = "GeeksQuiz";
      String expectedOutput = "ziuQskeeG";
      String actualOutput = "";
      char[] inputCharArr = input.toCharArray();

      for (char inputChar : inputCharArr) {
         rs.push(inputChar);
      }

      StringBuilder sb = new StringBuilder();
      for (int index = 0; index < inputCharArr.length; index++) {
         sb.append(rs.pop());
      }
      actualOutput = sb.toString();

      if (actualOutput.equals(expectedOutput)) {
         System.out.println("Passed");
      } else {
         System.out.println("Failed");
      }

   }
}
