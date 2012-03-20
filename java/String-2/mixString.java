public String mixString(String a, String b) {
  int aLen = a.length();
  int bLen = b.length();
  int max = Math.max(aLen, bLen);
  String word = "";
  
  for (int i = 0; i < max; i++) {
    if (i <= aLen-1)
      word += a.substring(i,i+1);
    if (i <= bLen-1)
      word += b.substring(i,i+1);

  }
  return word;
}
