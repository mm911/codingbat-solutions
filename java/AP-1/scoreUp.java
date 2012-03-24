public int scoreUp(String[] key, String[] answers) {
  int score = 0;
  for (int i = 0; i < key.length; i++) {
    if (key[i] == answers[i])
      score += 4;
    else if (answers[i] != "?" && answers[i] != key[i])
      score--;
  }
  return score;
}
