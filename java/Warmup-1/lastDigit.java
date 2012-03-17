public boolean lastDigit(int a, int b) {
  String strA = Integer.toString(a);
  String strB = Integer.toString(b);
  
  if (strA.charAt(strA.length() - 1) == strB.charAt(strB.length() - 1))
    return true;
  else
    return false;
}
