public int sumHeights(int[] heights, int start, int end) {
  int tmp = 0;
  for (int i = start; i <= end-1; i++) {
    tmp += Math.abs(heights[i] - heights[i+1]);
  }
  return tmp;
}
