class min_recorder{
    public int minReorder(int n, int[][] connections) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        
        for (int[] e : connections) {
            graph.get(e[0]).add(new int[]{e[1], 1});
            graph.get(e[1]).add(new int[]{e[0], 0});
        }
        
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        int ans = 0;
        
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int[] next : graph.get(node)) {
                int nei = next[0], cost = next[1];
                if (!vis[nei]) {
                    ans += cost;
                    vis[nei] = true;
                    q.add(nei);
                }
            }
        }
        return ans;
    }
}
