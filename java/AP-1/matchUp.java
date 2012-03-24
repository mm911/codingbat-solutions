public int matchUp(String[] a, String[] b) {
  int count = 0;
  for (int i = 0; i < a.length; i++) {
    String tmp1 = a[i];
    String tmp2 = b[i];
    if (!tmp1.equals("") && !tmp2.equals("")) {
      if (tmp1.charAt(0) == tmp2.charAt(0))
        count++;
    }
    
  }
  return count;
}
