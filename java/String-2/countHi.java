public int countHi(String str) {
  int len = str.length();
  int count = 0;
  
  for (int i = 0; i < len - 1; i++) {
    String temp = str.substring(i, i+2);
    if (temp.compareTo("hi") == 0)
      count++;  
  }
  return count;
}
