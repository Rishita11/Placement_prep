/*
Given a Binary Tree, find the In-Order Traversal of it.

Example 1:

Input:
       1
     /  \
    3    2
Output: 3 1 2

*/

class Solution {
     void fun(Node root, ArrayList<Integer> l){
     if(root==null)
     return;
     fun(root.left,l);
     l.add(root.data);
     fun(root.right,l);
     
     }
     
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> l=new ArrayList<>();
        fun(root,l);
        return l;
    }
}
