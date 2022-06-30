/*
Given a binary tree, find its level order traversal.
Level order traversal of a tree is breadth-first traversal for the tree.


Example 1:

Input:
    1
  /   \ 
 3     2
Output:1 3 2
*/

class Solution
{
     
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> l=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        while(q.size()!=0){
            Node cur=q.poll();
            l.add(cur.data);
            if(cur.left!=null){
                q.add(cur.left);
            }
            if(cur.right!=null)
            {
                q.add(cur.right);
            }
            
        }
        return l;
        
    }
}
