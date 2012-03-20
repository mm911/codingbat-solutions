public int roundSum(int a, int b, int c) {
  return round10(a) + round10(b) + round10(c);
}

public int round10(int n) {
  if (n % 10 < 5)
    return n - (n%10);
  else
    return n + (10 - (n%10));
}