public boolean equalIsNot(String str) {
  int len = str.length();
  int not = 0;
  int is = 0;
  
  for (int i = 0; i < len; i++) {
    if (i < len - 2) {
      String tmp = str.substring(i,i+3);
      if (tmp.equals("not"))
        not++;
    }
    if (i < len - 1) {
      String tmp2 = str.substring(i,i+2);
      if (tmp2.equals("is"))
        is++;
    }
  }

  
  if (not == is)
    return true;
  else
    return false;

}
