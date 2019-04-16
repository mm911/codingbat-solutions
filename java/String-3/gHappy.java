public boolean gHappy(String str) {
  if (str.length() == 1) return false;
  for (int i = 0; i<str.length(); ++i)
    if (str.charAt(i) == 'g') {
      if (i>0 && i<str.length()-1 && str.charAt(i-1) != 'g' &&
        str.charAt(i+1) != 'g')
        return false;
      if (i == str.length()-1 && str.charAt(i-1) != 'g')
        return false;
    }
  return true;
}
