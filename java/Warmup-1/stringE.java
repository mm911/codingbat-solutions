public boolean stringE(String str) {
  int len = str.length();
  int counter = 0;
  
  for (int i = 0; i < len; i++) {
    if (str.charAt(i) == 'e')
      counter++;
  }
  
  if (counter >= 1 && counter <= 3)
    return true;
  else
    return false;
}
