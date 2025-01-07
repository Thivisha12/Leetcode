/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        //If our root node is null, directly return empty list
        if(root == null) return res;
        //else add our root node's val in queue
        q.add(root);
        //Now run a while loop until our queue does not become empty
        while(q.isEmpty()==false){
            //take size of the queue, bcz we will run our inner loop that many times
            int size = q.size();
            //List which will store our levels
            ArrayList<Integer> sublist = new ArrayList<>();
            for(int i=0;i<size;i++){
                //check if our node's left is null or not, if not add that node in queue
                if(q.peek().left != null) q.add(q.peek().left);
                //check if our node's right is null or not, if not add that node in queue
                if(q.peek().right != null) q.add(q.peek().right);
                //Now as we check both left and right means our peek value's work is finished, 
                //so we can take it out and add into our sublist
                sublist.add(q.poll().val);
            }
            res.add(sublist);
        }
        return res;
    }
}