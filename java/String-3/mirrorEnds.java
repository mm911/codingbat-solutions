public String mirrorEnds(String string) {
  int len = string.length();
  String fin = "";
  String tmp1 = "";
  String tmp2 = "";

  
  for (int i = 0; i < len; i++) {
    tmp1 += string.substring(i,i+1);
    tmp2 = "";
    for (int j = tmp1.length()-1; j >= 0; j--) {
      tmp2 += tmp1.substring(j,j+1);
      if (tmp2.equals(string.substring(len-i-1,len)))
        fin = tmp1;
    }
  }
  return fin;
}
