public int sumHeights2(int[] heights, int start, int end) {
    int tmp = 0;
  for (int i = start; i <= end-1; i++) {
    if (heights[i] < heights[i+1]) {
      tmp += 2 * (Math.abs(heights[i] - heights[i+1]));
    }
    else
      tmp += Math.abs(heights[i] - heights[i+1]);
  }
  return tmp;
}
