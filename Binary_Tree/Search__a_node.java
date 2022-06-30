/*
Given a Binary Search Tree and a node value X, find if the node with value X is present in the BST or not.


Example 1:

Input:         2
                \
                 81 
               /    \ 
             42      87 
              \       \ 
               66      90 
              / 
            45
X = 87
Output: 1
Explanation: As 87 is present in the
given nodes , so the output will be
1.
*/

class BST {
  
        
       
    boolean search(Node root, int x) {
        if(root==null) return false;
       if(root.data==x)
       return true;
       if(root.data>x)
        return search(root.left,x);
       else
       return search(root.right,x);
    }
}
