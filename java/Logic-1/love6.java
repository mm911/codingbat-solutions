public boolean love6(int a, int b) {
  if (a == 6 || b == 6)
    return true;
    
  int sum = a+b;
  int diff = Math.abs(a-b);
  
  if (sum == 6 || diff == 6)
    return true;
  else
    return false;
}
