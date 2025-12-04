class right_side_view {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, 0, ans);
        return ans;
    }

    void dfs(TreeNode node, int level, List<Integer> ans) {
        if (node == null) return;

        if (level == ans.size()) {
            ans.add(node.val);
        }

        dfs(node.right, level + 1, ans);
        dfs(node.left, level + 1, ans);
    }
}
