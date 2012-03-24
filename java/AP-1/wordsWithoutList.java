public List wordsWithoutList(String[] words, int len) {
  ArrayList al = new ArrayList();
  for (int i = 0; i < words.length; i++) {
    if (words[i].length() != len)
      al.add(words[i]);
  }
  return al;
}
