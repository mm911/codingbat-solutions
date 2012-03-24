public int[] seriesUp(int n) {
  int[] result = new int[n * (n + 1) / 2];
  int i = 0;
  for (int j = 1; j <= n; ++j)
    for (int k = 1; k <= j; ++k)
      result[i++] = k;
  return result;
}

