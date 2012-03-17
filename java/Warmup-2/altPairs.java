public String altPairs(String str) {
  String result = "";
  
  for (int i=0; i<str.length(); i += 4) {
    int end = i + 2;
    if (end > str.length()) {
      end = str.length();
    }
    result = result + str.substring(i, end);
  }
  
  return result;
}