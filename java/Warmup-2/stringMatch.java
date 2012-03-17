public int stringMatch(String a, String b) {
  int len = Math.min(a.length(), b.length());
  int count = 0;
  
  for (int i = 0; i < len-1; i++){
    String aSub = a.substring(i, i+2);
    String bSub = b.substring(i, i+2);
    if (aSub.equals(bSub))
      count++;  
  }
  return count;
}
