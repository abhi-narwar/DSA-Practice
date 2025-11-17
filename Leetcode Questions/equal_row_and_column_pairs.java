import java.util.*;
class equal_row_and_column_pairs {

    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> map = new HashMap<>();

        
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[i][j]).append(",");
            }
            String row = sb.toString();
            map.put(row, map.getOrDefault(row, 0) + 1);
        }

        int count = 0;

       
        for (int col = 0; col < n; col++) {
            StringBuilder sb = new StringBuilder();
            for (int row = 0; row < n; row++) {
                sb.append(grid[row][col]).append(",");
            }
            String colStr = sb.toString();
            count += map.getOrDefault(colStr, 0);
        }

        return count;
    }
}
