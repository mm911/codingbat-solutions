public int luckySum(int a, int b, int c) {
  if (a == 13)
    return 0;
  else if (b == 13)
    return a;
  else if (c == 13)
    return a + b;
  else
    return a + b +c;
}
