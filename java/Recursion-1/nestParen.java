public boolean nestParen(String str) {
  if (str.equals("")) return true;
  if (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')')
    return nestParen(str.substring(1,str.length()-1));
  else
    return false;
}
