class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1), area2 = (bx2 - bx1) * (by2 - by1);
        int coverX = ax2 < bx1 ? 0 : ax2 < bx2 ? ax1 < bx1 ? ax2 - bx1 : ax2 - ax1 : ax1 > bx2 ? 0 : ax1 < bx1 ? bx2 - bx1 : bx2 - ax1;
        int coverY = ay2 < by1 ? 0 : ay2 < by2 ? ay1 < by1 ? ay2 - by1 : ay2 - ay1 : ay1 > by2 ? 0 : ay1 < by1 ? by2 - by1 : by2 - ay1;
        return area1 + area2 - coverX * coverY;
    }
}