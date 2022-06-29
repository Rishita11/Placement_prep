/*
Given a Binary Tree, print Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument.

Left view of following tree is 1 2 4 8.

          1
       /     \
     2        3
   /     \    /    \
  4     5   6    7
   \
     8   

Example 1:

Input:
   1
 /  \
3    2
Output: 1 3

*/

class Tree
{
    void printLeft(Node root, ArrayList<Integer> l, int level){
        if(root==null)
        return;
        if(l.size()==level){
            l.add(root.data);
    }
      printLeft(root.left,l,level+1);
      printLeft(root.right,l,level+1);
        
    }
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> l=new ArrayList<>();
        printLeft(root,l,0);
        return l;
      // Your code here
    }
}
