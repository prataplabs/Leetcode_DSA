class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;

        if (n <= 2) {
            return n;
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {

            HashMap<String, Integer> map = new HashMap<>();

            int duplicate = 1; 
            int max = 0;

            for (int j = i + 1; j < n; j++) {

                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                // Duplicate point
                if (dx == 0 && dy == 0) {
                    duplicate++;
                    continue;
                }

                int g = gcd(dx, dy);

                dx /= g;
                dy /= g;

                // Normalize sign
                if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                }

                // Vertical line
                if (dx == 0) {
                    dy = 1;
                }

                // Horizontal line
                if (dy == 0) {
                    dx = 1;
                }

                String key = dy + "/" + dx;

                if (map.containsKey(key)) {

                    int count = map.get(key);
                    count++;
                    map.put(key, count);

                } else {

                    map.put(key, 1);

                }

                if (map.get(key) > max) {
                    max = map.get(key);
                }
            }

            ans = Math.max(ans, max + duplicate);
        }

        return ans;
        
    }

     private int gcd(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {

            int rem = a % b;
            a = b;
            b = rem;
        }

        return a;
    }
}