public boolean lastDigit(int a, int b, int c) {
  int modA = a % 10;
  int modB = b % 10;
  int modC = c % 10;
  
  if (modA == modB || modA == modC || modB == modC)
    return true;
  else
    return false;
}
