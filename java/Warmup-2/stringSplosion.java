public String stringSplosion(String str) {
  int len = str.length();
  String temp = "";
  
  for (int i = 0; i < len + 1; i++)
    temp += str.substring(0,i);
  return temp;
}
