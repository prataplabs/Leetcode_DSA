class Solution {

    static class State {
        int row, col, energy, mask, moves;

        State(int row, int col, int energy, int mask, int moves) {
            this.row = row;
            this.col = col;
            this.energy = energy;
            this.mask = mask;
            this.moves = moves;
        }
    }
    
    public int minMoves(String[] classroom, int energy) {
     
     int m = classroom.length;
        int n = classroom[0].length();

        int startRow = 0;
        int startCol = 0;

        int[][] litterId = new int[m][n];
        for (int[] row : litterId) {
            Arrays.fill(row, -1);
        }

        int litterCount = 0;

       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                char ch = classroom[i].charAt(j);

                if (ch == 'S') {
                    startRow = i;
                    startCol = j;
                }

                if (ch == 'L') {
                    litterId[i][j] = litterCount++;
                }
            }
        }

       
        if (litterCount == 0) {
            return 0;
        }

        int allCollected = (1 << litterCount) - 1;

        Queue<State> queue = new LinkedList<>();

       
        boolean[][][][] visited =
                new boolean[m][n][energy + 1][1 << litterCount];

        queue.offer(new State(
                startRow,
                startCol,
                energy,
                0,
                0
        ));

        visited[startRow][startCol][energy][0] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {

            State curr = queue.poll();

            if (curr.mask == allCollected) {
                return curr.moves;
            }

            if (curr.energy == 0) {
                continue;
            }

            for (int d = 0; d < 4; d++) {

                int nr = curr.row + dr[d];
                int nc = curr.col + dc[d];

                // Out of bounds
                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                // Obstacle
                if (classroom[nr].charAt(nc) == 'X') {
                    continue;
                }

                int newEnergy = curr.energy - 1;
                int newMask = curr.mask;

                char cell = classroom[nr].charAt(nc);

                // Collect litter
                if (cell == 'L') {
                    int id = litterId[nr][nc];
                    newMask |= (1 << id);
                }

                // Reset energy
                if (cell == 'R') {
                    newEnergy = energy;
                }

                if (!visited[nr][nc][newEnergy][newMask]) {

                    visited[nr][nc][newEnergy][newMask] = true;

                    queue.offer(new State(
                            nr,
                            nc,
                            newEnergy,
                            newMask,
                            curr.moves + 1
                    ));
                }
            }
        }

        return -1;
        
    }
}