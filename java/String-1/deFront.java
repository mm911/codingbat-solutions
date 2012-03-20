public String deFront(String str) {    
  int len = str.length();
  String temp = "";
  
  for (int i = 0; i < len; i++) {
    if (i == 0 && str.charAt(i) == 'a')
      temp += 'a';
    else if (i == 1 && str.charAt(i) == 'b')
      temp += 'b';
    else if (i > 1)
      temp += str.charAt(i);
  }
    return temp;
}
