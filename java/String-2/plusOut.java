public String plusOut(String str, String word) {
  int slen = str.length();
  int wlen = word.length();
  String fin = "";
  
  for (int i = 0; i < slen; i++) {
    if (i <= slen - wlen) {
      String tmp = str.substring(i,i+wlen);
      if (tmp.equals(word)) {
        fin += word;
        i += wlen-1;
      }
      else
        fin += "+";
    }
    else
      fin += "+";
  }
  
  return fin;
}
