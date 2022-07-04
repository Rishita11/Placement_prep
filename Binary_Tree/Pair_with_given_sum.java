/*Given a Binary Search Tree and a target sum. Check whether there's a pair of Nodes in the BST with value summing up to the target sum. 

Example 1:

Input:
        2
      /   \
     1     3
sum = 5
Output: 1 
Explanation: 
Nodes with value 2 and 3 sum up to 5.
*/
class Solution
{
    // root : the root Node of the given BST
    // target : the target sum
    public int isPairPresent(Node root, int target)
    {
        Set<Integer> s=new HashSet<>();
        boolean ans= find(root, target, s);
        return ans? 1:0;
        
    }
    
    boolean find(Node root, int sum, Set<Integer> s){
        if(root==null) return false;
        if(find(root.left,sum,s)==true)
          return true;
        if(s.contains(sum-root.data)){
            return true;
        }
        s.add(root.data);
        return find(root.right,sum,s);
         
    }
}
