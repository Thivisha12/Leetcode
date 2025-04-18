import java.util.*;
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }
    
    private void dfs(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);       // Visit root
        dfs(node.left, result);     // Traverse left subtree
        dfs(node.right, result);    // Traverse right subtree
    }
}