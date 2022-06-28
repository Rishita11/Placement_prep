/*
Given a binary tree, find the Postorder Traversal of it.
For Example, the postorder traversal of the following tree is:
5 10 39 1

        1
     /     \
   10     39
  /
5


Example 1:

Input:
        19
     /     \
    10      8
  /    \
 11    13
Output: 11 13 10 8 19
*/

class Tree
{
    void fun(Node root, ArrayList<Integer> l){
        if(root==null)
        return;
        fun(root.left,l);
        fun(root.right,l);
        l.add(root.data);
        
    }
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
        ArrayList<Integer> l=new ArrayList<>();
        fun(root,l);
        return l;
       // Your code goes here
    }
}
