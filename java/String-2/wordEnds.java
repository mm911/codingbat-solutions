public String wordEnds(String str, String word) {
  int slen = str.length();
  int wlen = word.length();
  String fin = "";
  
  for (int i = 0; i < slen-wlen+1; i++) { 
    String tmp = str.substring(i,i+wlen);
    if (i > 0 && tmp.equals(word))
      fin += str.substring(i-1,i);
    if (i < slen-wlen && tmp.equals(word))
      fin += str.substring(i+wlen,i+wlen+1);
  }
  return fin;
}
