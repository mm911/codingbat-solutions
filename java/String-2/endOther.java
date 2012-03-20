public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  int aLen = a.length();
  
  b = b.toLowerCase();
  int bLen = b.length();
  
  if (aLen < bLen) {
    String temp = b.substring(bLen - aLen, bLen);
    if (temp.compareTo(a) == 0)
      return true;
    else
      return false;
    
  } else {
    String temp = a.substring(aLen - bLen, aLen);
    if (temp.compareTo(b) == 0)
      return true;
    else
      return false;
  }
  
}
