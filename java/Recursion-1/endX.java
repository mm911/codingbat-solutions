public String endX(String str) {
  if (str.equals("")) return str;
  if (str.charAt(0) == 'x') return endX(str.substring(1)) + 'x';
  else return str.charAt(0) + endX(str.substring(1));
}
