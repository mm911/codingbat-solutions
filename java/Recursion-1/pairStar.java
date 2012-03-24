public String pairStar(String str) {
  if (str.equals("") || str.length() == 1) return str;
  if (str.charAt(0) == str.charAt(1)) 
    return str.charAt(0) + "*" + pairStar(str.substring(1));
  else
    return str.charAt(0) + pairStar(str.substring(1));
}
