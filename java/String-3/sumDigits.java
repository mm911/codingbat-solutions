public int sumDigits(String str) {
  int len = str.length();
  int sum = 0;
  
  for (int i = 0; i < len; i++) {
    if (Character.isDigit(str.charAt(i))) {
      String tmp = str.substring(i,i+1);
      sum += Integer.parseInt(tmp);
    }
  }
  return sum;
}
