public boolean prefixAgain(String str, int n) {
  int len = str.length();
  String prefix = str.substring(0,n);
  
  for (int i = n; i < len; i++) {
    if(n+i <= len) { 
      if (prefix.equals(str.substring(i,n+i)))
        return true;
    }
  }
  return false;
}
