public boolean nearHundred(int n) {
  int sum1 = Math.abs(n - 100);
  int sum2 = Math.abs(n - 200);
  
  if (sum1 <= 10 || sum2 <= 10)
    return true;
  else
    return false;
}