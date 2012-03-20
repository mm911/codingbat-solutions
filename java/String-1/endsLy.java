public boolean endsLy(String str) {
  int len = str.length();
  String ly = "ly";
 
  if (len < 2)
    return false;
  else if (ly.equals(str.substring(len-2,len)))
    return true;
  else
    return false;
}
