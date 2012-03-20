public boolean sameStarChar(String str) {
  int len = str.length();
  boolean found = true;
  
  for (int i = 0; i < len; i++) {
    String tmpString = str.substring(i,i+1);
  
    if (tmpString.equals("*") && i > 0 && i < len-1) {
      if (str.charAt(i-1) == str.charAt(i+1))
        found = true;
      else
        found = false;
    }
  }
  return found;
}
