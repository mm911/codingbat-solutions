public int scoresSpecial(int[] a, int[] b) {
  int spec1 = helper(a);
  int spec2 = helper(b);
  return spec1 + spec2;
}

public int helper(int[] a) {
  int tmp = 0;
  for (int i = 0; i < a.length; i++) {
    if (a[i] % 10 == 0 && a[i] > tmp)
      tmp = a[i];
  }
  return tmp;
}
