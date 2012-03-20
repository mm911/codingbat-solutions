public String doubleChar(String str) {
  int len = str.length();
  String new_str = "";
  for (int i = 0; i < len; i++) {
    new_str += str.substring(i,i+1) + str.substring(i, i+1);
  }
  return new_str;
}
