public Boolean xyzThere(String str) {
  int len = str.length();
  String xyz = "xyz";
  
  Boolean match = false;

  if (len < 3)
    return false;

  for (int i = 0; i < len - 2; i ++) {
    String temp = str.substring(i, i+3); 
    if (temp.compareTo(xyz) == 0 && i == 0)
      match = true;
    else if(temp.compareTo(xyz) == 0 && str.charAt(i-1) != 46)
      match = true;
      
  }  
  return match;
}
