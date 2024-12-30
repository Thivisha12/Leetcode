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
    int count = 0;// Tracks the number of nodes visited
    int result = -1; // Stores the k-th smallest element
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode root, int k){
        if(root == null){
            return ;
        }

        inorder(root.left, k);
        count++;
        if(count == k){
            result = root.val;// Store k-th smallest value
            return;
        }
        inorder(root.right, k);
    }
}