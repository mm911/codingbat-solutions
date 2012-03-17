public String frontTimes(String str, int n) {
  int len = str.length();
  String temp = "";
  
  if (len < 4) {
    for (int i = 0; i < n; i++) {
      temp += str;
    }
  } else {
      for (int j = 0; j < n; j++) {
        temp += str.substring(0,3);
      }
  }
  
  return temp;
}
