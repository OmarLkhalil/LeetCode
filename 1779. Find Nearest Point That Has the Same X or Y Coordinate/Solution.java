class Solution {
  public int nearestValidPoint(int x, int y, int[][] points) {
    int result = -1;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < points.length; ++i) {
      final int dx = x - points[i][0];
      final int dy = y - points[i][1];
      if (dx == 0 || dy == 0) {
        final int distance = Math.abs(dx + dy);
        if (distance < min) {
          min = distance;
          result = i;
        }
      }
    }

    return result;
  }
}
