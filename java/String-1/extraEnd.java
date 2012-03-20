public String extraEnd(String str) {
  String s = str.substring(str.length()-2, str.length());
  return s+s+s;
}