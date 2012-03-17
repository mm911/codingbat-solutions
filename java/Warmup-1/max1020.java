public int max1020(int a, int b) {
  int tempa;
  int tempb;
  
  if (a >= 10 && a <= 20)
    tempa = a;
  else
    tempa = 0;
  
  if (b >= 10 && b <= 20)
    tempb = b;
  else
    tempb = 0;
   
  return Math.max(tempa, tempb);
}
