class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int cloX = Math.max(x1, Math.min(xCenter, x2));
        int cloY = Math.max(y1, Math.min(yCenter, y2));

        int dx = xCenter - cloX;
        int dy = yCenter - cloY;

        return (dx*dx + dy*dy) <= (radius*radius);
        
    }
}