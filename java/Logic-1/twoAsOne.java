public boolean twoAsOne(int a, int b, int c) {
  if ( a + b == c || c + b == a || c + a == b)
    return true;
  else
    return false;
}
