class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
    //    boolean visit[] = new boolean[n];
    //    int ans = 0;
    //    Arrays.sort(reservedSeats, (a, b) -> a[0] - b[0]);

    //    for(int i=0; i< reservedSeats.length ;i++){
    //     if(reservedSeats[i][0] == reservedSeats[i+1][0]){
    //         if(reservedSeats[i+1][1] - reservedSeats[i][1] >= 4){
    //             ans++;
    //         }
    //     }
    //     visit[reservedSeats[i][0]] = true;

    //    } 

    //    for(int i=1; i<=n ; i++){
    //     if(visit[i] == false){
    //         ans = ans+2;
    //     }
    //    }

    //    return ans;
      int l = 0, r = 0, prev = 0;
        int sz = reservedSeats.length;

        Arrays.sort(reservedSeats, (a, b) -> a[0] - b[0]);

        boolean[] isReserved = new boolean[11];
        int ans = 0;

        while (r < sz) {

            // Count rows with no reservations
            ans += 2 * (reservedSeats[r][0] - prev - 1);

            prev = reservedSeats[r][0];

            // Mark all reserved seats in the current row
            while (r < sz && reservedSeats[l][0] == reservedSeats[r][0]) {
                isReserved[reservedSeats[r][1]] = true;
                r++;
            }

            // Check the three possible groups
            boolean twoToFive = check(isReserved, 2, 5);
            boolean fourToSeven = check(isReserved, 4, 7);
            boolean sixToNine = check(isReserved, 6, 9);

            // Two non-overlapping groups
            if (twoToFive && sixToNine) {
                ans += 2;
            }
            // At least one group is available
            else if (twoToFive || fourToSeven || sixToNine) {
                ans++;
            }

            l = r;

            // Reset for the next row
            Arrays.fill(isReserved, false);
        }

        // Remaining rows are completely empty
        ans += 2 * (n - prev);

        return ans;
    }

    public boolean check(boolean[] b, int l, int r) {
        for (int i = l; i <= r; i++) {
            if (b[i]) {
                return false;
            }
        }
        return true;

    }
}