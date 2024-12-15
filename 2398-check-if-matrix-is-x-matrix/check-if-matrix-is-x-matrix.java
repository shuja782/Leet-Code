class Solution {
    public boolean checkXMatrix(int[][] grid) {
        if (grid.length != grid[0].length)
            return false;

        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - 1 - i) { 
                    if (grid[i][j] == 0) {
                        return false; 
                    }
                } else {
                    if (grid[i][j] != 0) {
                        return false; 
                    }
                }
            }
        }
        return true;
    }
}
