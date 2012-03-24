public int countX(String str) {
  if (str.equals("")) return 0;
  if (str.charAt(0) == 'x') return 1 + countX(str.substring(1));
  else return countX(str.substring(1));
}
