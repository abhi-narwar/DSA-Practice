class longest_zig_zac {
    int maxLen = 0;

    public int longestZigZag(TreeNode root) {
        dfs(root, 0, -1);
        dfs(root, 0, 1);
        return maxLen;
    }

    
    public void dfs(TreeNode node, int length, int dir) {
        if (node == null) return;

        maxLen = Math.max(maxLen, length);

        
        if (dir == 0) {
            dfs(node.right, length + 1, 1); 
            dfs(node.left, 1, 0);          
        }

        
        if (dir == 1) {
            dfs(node.left, length + 1, 0);
            dfs(node.right, 1, 1); 
        }
    }
}
