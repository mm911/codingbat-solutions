public boolean makes10(int a, int b) {
  int sum = a + b;
  if (a == 10 || b == 10)
    return true;
  else if (sum == 10)
    return true;
  else
    return false;
}
