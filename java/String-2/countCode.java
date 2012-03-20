public int countCode(String str) {
  int len = str.length();
  int count = 0;
  String co = "co";
  String e = "e";
  
  if (len < 4)
    return 0;
  
  for (int i = 0; i < len - 3; i++) {
    if (co.compareTo(str.substring(i,i+2)) == 0 && e.compareTo(str.substring(i+3, i+4)) == 0)
      count++;
  }
  return count;
}
