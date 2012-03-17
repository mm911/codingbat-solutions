public int last2(String str) {
  if (str.length() < 2) return 0;
 
  String end = str.substring(str.length()-2);

  int count = 0;
  
  for (int i=0; i<str.length()-2; i++) {
    String sub = str.substring(i, i+2);
    if (sub.equals(end)) {
      count++;
    }
  }

  return count;

}
