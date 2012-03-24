public String withoutString(String base, String remove) {
  int blen = base.length();
  int rlen = remove.length();
  String lowbase = base.toLowerCase();
  String lowrem = remove.toLowerCase();
  String fin = "";

  for (int i = 0; i < blen; i++) {
    if (i <= blen - rlen) {
      String tmp = lowbase.substring(i,i+rlen);
      if (!tmp.equals(lowrem))
        fin += base.substring(i,i+1);
      else {
        i += rlen-1;
      }
    }
    else {
      String tmp2 = lowbase.substring(i,i+1);
      if (!tmp2.equals(lowrem))
        fin += base.substring(i,i+1);
    }
  }
  
  return fin;
}
