/*
Given a binary tree, find its preorder traversal.

Example 1:

Input:
        1      
      /          
    4    
  /    \   
4       2
Output: 1 4 4 2 
*/

class BinaryTree
{
    static void fun(Node root, ArrayList<Integer> l)
    { 
        if(root==null) return;
        l.add(root.data);
        fun(root.left,l);
        fun(root.right,l);
        
        
    }
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> l=new ArrayList<>();
        fun(root,l);
        return l;
    }

}
