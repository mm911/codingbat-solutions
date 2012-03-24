public int sumNumbers(String str) {
  int len = str.length();
  int sum = 0;
  String tmp = "";
  
  for (int i = 0; i < len; i++) {
    if (Character.isDigit(str.charAt(i))) {
      if (i < len-1 && Character.isDigit(str.charAt(i+1))) {
        tmp += str.charAt(i);
      }
      else {
        tmp += str.charAt(i);
        sum += Integer.parseInt(tmp);
        tmp = "";
      }
        
    }
  }
  
  return sum;
}
