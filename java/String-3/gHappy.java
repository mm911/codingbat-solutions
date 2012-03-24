public boolean gHappy(String str) {
  int len = str.length();
  boolean happy = true;

  for (int i = 0; i < len; i++) {
    if (str.charAt(i) == 'g') {
      if (i > 0 && str.charAt(i-1) == 'g')
        happy = true;
      else if (i < len-1 && str.charAt(i+1) == 'g')
        happy = true;
      else
        happy = false;
    }
  }
  return happy;
}
