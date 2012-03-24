public int bigHeights(int[] heights, int start, int end) {
  int tmp = 0;
  for (int i = start; i <= end-1; i++) {
    if (Math.abs(heights[i] - heights[i+1]) >= 5) {
      tmp++;
    }
  }
  return tmp;
}
