public int sumLimit(int a, int b) {
  String aString = String.valueOf(a);
  int aLen = aString.length();
  String sumString = String.valueOf(a+b);
  int sumLen = sumString.length();
  
  if (sumLen == aLen)
    return a + b;
  else
    return a;
  
}
