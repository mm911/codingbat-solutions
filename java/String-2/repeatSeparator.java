public String repeatSeparator(String word, String sep, int count) {
  String newWord = "";
  
  for (int i = 0; i < count; i++) {
    if (i < count-1)
      newWord += word + sep;
    else
      newWord += word;
  }
  return newWord;
}
