public String repeatFront(String str, int n) {
  int len = str.length();
  String newWord = "";
  
  for (int i = n; n > 0; n--){
    newWord += str.substring(0,n);
  }
  return newWord;
}
